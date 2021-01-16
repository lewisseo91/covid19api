import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import model.ApiResponseModel;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class xmlParsingTest {

    @Test
    void xmlTest() throws IOException {
        String a = "<response>" +
                "<header>" +
                "<resultCode>00</resultCode>\n" +
                "<resultMsg>NORMAL SERVICE.</resultMsg>"+
                "</header>" +
                "</response>";
        String b = "<response>" +
                "<resultCode>00</resultCode>\n" +
                "<resultMsg>NORMAL SERVICE.</resultMsg>"+
                "</response>";

        XmlMapper mapper = new XmlMapper();
        ApiResponseModel apiResponseModel = mapper.readValue( a, ApiResponseModel.class );
        System.out.println(apiResponseModel.toString());
    }

}
