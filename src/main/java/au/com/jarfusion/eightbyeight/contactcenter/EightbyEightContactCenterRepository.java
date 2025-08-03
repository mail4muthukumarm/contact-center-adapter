package au.com.jarfusion.eightbyeight.contactcenter;

import com.azure.storage.blob.BlobClient;
import com.azure.storage.blob.BlobContainerClient;
import com.azure.storage.blob.BlobServiceClient;
import com.azure.storage.blob.BlobServiceClientBuilder;
import org.apache.hc.client5.http.fluent.Content;
import org.apache.hc.client5.http.fluent.Request;
import org.apache.hc.core5.http.ContentType;
import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;

public class EightbyEightContactCenterRepository {

    String env = "";
    public EightbyEightContactCenterRepository(String env){
        this.env = env;
    }

    /*
     Downloads the 8x8 file and store into azure blob storage
     */
    public String download8x8File(String input){
        JSONObject inputObj = new JSONObject(input);
        JSONObject overAllResult = new JSONObject();
        StringBuilder debugMessage = new StringBuilder();
        try {
            String objectId = inputObj.get("ObjectId") == JSONObject.NULL ? null : (String) inputObj.get("ObjectId");
            String authToken = inputObj.get("AuthToken") == JSONObject.NULL ? null : (String) inputObj.get("AuthToken");
            String oDate = inputObj.get("ODate") == JSONObject.NULL ? null : (String) inputObj.get("ODate");

            String response = downloadFileName(objectId, authToken, debugMessage);
            JSONObject filenameObject = new JSONObject(response);
            overAllResult.put("FileName",(String)filenameObject.get("FileName"));
            downloadFile((String)filenameObject.get("FileName"), authToken, oDate, debugMessage);
        }
        catch (Exception ex){
            debugMessage.append("Error - "+ ex.getMessage());
            debugMessage.append("Error-StackTrace - "+ex.getStackTrace()+ex.getCause().getMessage());
        }
        finally{
            overAllResult.put("DebugMessage", debugMessage.toString());
        }
        return overAllResult.toString();
    }

    /*
        Downloads the 8x8 file name
     */
    public String downloadFileName(String objectId,
                                   String authToken,
                                   StringBuilder debugMessage) {
        String fileUrl = "https://api.8x8.com/storage/us-east/v3/bulk/download/start";
        String fileName = "";
        JSONObject resp = new JSONObject();
        try {
            Content response = Request.post(fileUrl)
                    .addHeader("Authorization", authToken)
                    .addHeader("Accept", "application/json")
                    .bodyString("[\""+ objectId  +"\"]", ContentType.APPLICATION_JSON)
                    .execute()
                    .returnContent();
            JSONObject inputObj = new JSONObject(response.asString());
            fileName =  inputObj.get("zipName") == JSONObject.NULL ? null: (String)inputObj.get("zipName");
            resp.put("FileDownloadMetadata", response.asString());
            resp.put("FileName",fileName);

        } catch (Exception e) {
            debugMessage.append("Error occured in downloadFileName.Details -"+e.getMessage() +e.getStackTrace() + e.getCause().getMessage());
        }
        return resp.toString();
    }


    /*
        Downloads the 8x8 file data and store into azure blob storage
     */
    public void downloadFile(String fileName,
                             String authToken,
                             String oDate,
                             StringBuilder debugMessage){

        String fileUrl = "https://api.8x8.com/storage/us-east/v3/bulk/download/"+fileName;
        String localFilePath = System.getProperty("java.io.tmpdir")+fileName;
        //Azure Blob Storage settings
        String connectionString = "";
        if(this.env.toUpperCase().equals("TEST")) {
             connectionString = "DefaultEndpointsProtocol=https;AccountName=adlsservicenowdataengdev;AccountKey=gzgUuY7CPiI267+scO5DmGXB8WthMlzasxhlcCsND+Lm+2eE0NSpdaXYaAOuWAXQ3FOqtVIoyXEt+ASt8EeX7A==;EndpointSuffix=core.windows.net";
        }
        else if(this.env.toUpperCase().equals("PROD")){
            connectionString = "DefaultEndpointsProtocol=https;AccountName=adlsservicenowdataengprd;AccountKey=/bqP+LN6cv0nQILkJKHHNt7P2zGk/Ib+1xUS4a3ZjUQd4MmCeAE6s2oiu/bxbgA/eqPP9Cu9+1HP+AStiePT5w==;EndpointSuffix=core.windows.net";
        }
        String containerName = "8x8";
        String blobName =  oDate +"/"+ fileName;

        try {
            // Step 1: Download the file from the URL
            System.out.println("Downloading file from URL...");
            byte[] fileData = Request.get(fileUrl)
                    .addHeader("Authorization", authToken)
                    .execute()
                    .returnContent()
                    .asBytes();
            Files.write(Paths.get(localFilePath), fileData);
            System.out.println("File downloaded: " + localFilePath);
            debugMessage.append("Downloaded to Local File System"+localFilePath);

            // Step 2: Upload to Azure Blob Storage
            debugMessage.append("Uploading to blob storage");
            BlobServiceClient blobServiceClient = new BlobServiceClientBuilder()
                    .connectionString(connectionString)
                    .buildClient();
            BlobContainerClient containerClient = blobServiceClient.getBlobContainerClient(containerName);
            BlobClient blobClient = containerClient.getBlobClient(blobName);
            blobClient.uploadFromFile(localFilePath, true);
            debugMessage.append("Uploaded to blob storage"+ blobClient.getBlobUrl());

            //Delete local file
            Files.delete(Paths.get(localFilePath));
            debugMessage.append("Local file deleted.");

        } catch (Exception e) {
            debugMessage.append("Error Occured in downloadFile.Details -"+e.getMessage() +e.getStackTrace() + e.getCause().getMessage());
        }
    }
}
