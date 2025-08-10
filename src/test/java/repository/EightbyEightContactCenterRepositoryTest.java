package repository;

import au.com.jarfusion.eightbyeight.contactcenter.EightbyEightContactCenterRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import java.io.IOException;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@ExtendWith(MockitoExtension.class)
public class EightbyEightContactCenterRepositoryTest {

    @Test
    void shoulddownload8x8File() throws IOException, SQLException {

        String payload = "{\n" +
                "  \"ObjectId\": \"e0d1ee98-49ed-4ccc-a549-445f2ca41868\",\n" +
                "  \"BlobFileName\": \"\",\n" +
                "  \"AuthToken\": \"Bearer eyJhbGciOiJSUzI1NiJ9.eyJzZXJ2aWNlcyI6WyJDRS1QQ1MtUHJvZHVjdCIsIkNFLVJDUy1Qcm9kdWN0IiwiQ2hhdCIsIlFNIC0gQVBJIiwiYW5hbHl0aWNzIHByb2R1Y3QiLCJhbmFseXRpY3MgcmVhbHRpbWUtYXBpIiwiYXVkaXQiLCJjaGF0LWdhdGV3YXkiLCJzdG9yYWdlIiwidmNjIiwidmNjLWVpdnIiLCJ2Y2MtbmF0aXZlLWNybSIsInZjYy1zY2hlZHVsZXMiXSwiaXNzIjoiY2xvdWQ4Ljh4OC5jb20iLCJpYXQiOjE3NTQ3MTQ1NTAsInN1YiI6ImQxMmY0NjY0NzRlNzI0MjEyZDRhNzU2ODE0YmQzZjhhYzcyNGExYjUiLCJleHAiOjE3NTQ3MTYzNTB9.cofc-LprClZXxscog8_CSooKz86mAEQYbQakq_vnLeWwXXFNU0CVyDJeLv9AecZaHjR6fPq_3JiByd9OOE3wydBHshyisMFfE9dKTA9xdZk-rs5ODfghY0ZWhHRGe51dONbUqDkSnqd0NEnD64qzPtJBQSyjP0YK3Murx2uGKtCwTFWESLdb8Ae7sNAcFGGqvArNjBuL5QMcLCT9n0GmefPda4A92ZG_XDmF-BMLGN-IBBfCNsHR5PWs6YcbdNeCizQZyzMDhxz4d6eAG6SXfu1oIEPF60N4R0AzRalntU5DksPfS7T2qCLWhew6gI8vRHgQ_uU6prUd-8r8RozTdw\",\n" +
                "  \"ODate\": \"01_08_2025\",\n" +
                "  \"IsMetadataDownload\": 1\n" +
                "}";
        EightbyEightContactCenterRepository pr = new EightbyEightContactCenterRepository("test");
        String result = pr.download8x8File(payload);
        assertNotEquals(result,"");
    }
}
