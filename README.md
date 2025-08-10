var probe = new JavascriptProbe("test_mid_server");
probe.setName("8x8_Download8x8File");
probe.setJavascript("var pdf = new FortegraUtilContactCenter(); res = pdf.download8x8File();");
var jsonContent = {};
jsonContent["ObjectId"] = "e0d1ee98-49ed-4ccc-a549-445f2ca41868" ;
jsonContent["BlobFileName"] = ""
jsonContent["AuthToken"] = "Bearer  eyJhbGciOiJSUzI1NiJ9.eyJzZXJ2aWNlcyI6WyJDRS1QQ1MtUHJvZHVjdCIsIkNFLVJDUy1Qcm9kdWN0IiwiQ2hhdCIsIlFNIC0gQVBJIiwiYW5hbHl0aWNzIHByb2R1Y3QiLCJhbmFseXRpY3MgcmVhbHRpbWUtYXBpIiwiYXVkaXQiLCJjaGF0LWdhdGV3YXkiLCJzdG9yYWdlIiwidmNjIiwidmNjLWVpdnIiLCJ2Y2MtbmF0aXZlLWNybSIsInZjYy1zY2hlZHVsZXMiXSwiaXNzIjoiY2xvdWQ4Ljh4OC5jb20iLCJpYXQiOjE3NTQ3MTQ1NTAsInN1YiI6ImQxMmY0NjY0NzRlNzI0MjEyZDRhNzU2ODE0YmQzZjhhYzcyNGExYjUiLCJleHAiOjE3NTQ3MTYzNTB9.cofc-LprClZXxscog8_CSooKz86mAEQYbQakq_vnLeWwXXFNU0CVyDJeLv9AecZaHjR6fPq_3JiByd9OOE3wydBHshyisMFfE9dKTA9xdZk-rs5ODfghY0ZWhHRGe51dONbUqDkSnqd0NEnD64qzPtJBQSyjP0YK3Murx2uGKtCwTFWESLdb8Ae7sNAcFGGqvArNjBuL5QMcLCT9n0GmefPda4A92ZG_XDmF-BMLGN-IBBfCNsHR5PWs6YcbdNeCizQZyzMDhxz4d6eAG6SXfu1oIEPF60N4R0AzRalntU5DksPfS7T2qCLWhew6gI8vRHgQ_uU6prUd-8r8RozTdw";
jsonContent["ODate"] = "01_08_2025";
jsonContent["IsMetadataDownload"] = 1;
probe.addParameter("requestBody", JSON.stringify(jsonContent));
var strOutputEccId = probe.create();
gs.info(strOutputEccId);


var probe = new JavascriptProbe("test_mid_server");
probe.setName("8x8_Download8x8File");
probe.setJavascript("var pdf = new FortegraUtilContactCenter(); res = pdf.download8x8File();");
var jsonContent = {};
jsonContent["ObjectId"] = "e0d1ee98-49ed-4ccc-a549-445f2ca41868";
jsonContent["BlobFileName"] = "376fca5e-c380-411e-aa2b-2b6f7974968f.zip";
jsonContent["AuthToken"] = "Bearer  eyJhbGciOiJSUzI1NiJ9.eyJzZXJ2aWNlcyI6WyJDRS1QQ1MtUHJvZHVjdCIsIkNFLVJDUy1Qcm9kdWN0IiwiQ2hhdCIsIlFNIC0gQVBJIiwiYW5hbHl0aWNzIHByb2R1Y3QiLCJhbmFseXRpY3MgcmVhbHRpbWUtYXBpIiwiYXVkaXQiLCJjaGF0LWdhdGV3YXkiLCJzdG9yYWdlIiwidmNjIiwidmNjLWVpdnIiLCJ2Y2MtbmF0aXZlLWNybSIsInZjYy1zY2hlZHVsZXMiXSwiaXNzIjoiY2xvdWQ4Ljh4OC5jb20iLCJpYXQiOjE3NTQ3MTQ1NTAsInN1YiI6ImQxMmY0NjY0NzRlNzI0MjEyZDRhNzU2ODE0YmQzZjhhYzcyNGExYjUiLCJleHAiOjE3NTQ3MTYzNTB9.cofc-LprClZXxscog8_CSooKz86mAEQYbQakq_vnLeWwXXFNU0CVyDJeLv9AecZaHjR6fPq_3JiByd9OOE3wydBHshyisMFfE9dKTA9xdZk-rs5ODfghY0ZWhHRGe51dONbUqDkSnqd0NEnD64qzPtJBQSyjP0YK3Murx2uGKtCwTFWESLdb8Ae7sNAcFGGqvArNjBuL5QMcLCT9n0GmefPda4A92ZG_XDmF-BMLGN-IBBfCNsHR5PWs6YcbdNeCizQZyzMDhxz4d6eAG6SXfu1oIEPF60N4R0AzRalntU5DksPfS7T2qCLWhew6gI8vRHgQ_uU6prUd-8r8RozTdw";
jsonContent["ODate"] = "01_08_2025";
jsonContent["IsMetadataDownload"] = 0;
probe.addParameter("requestBody", JSON.stringify(jsonContent));
var strOutputEccId = probe.create();
gs.info(strOutputEccId);
