import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import controller.InitAPI;
import model.ApiResponseModel;

import java.io.IOException;

public class Main {



    public static void main(String[] args) throws IOException {
        //InitAPI.init();

        testXML();
    }

    public static void testXML() throws IOException {

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
        mapper.setDefaultUseWrapper(false);
        ApiResponseModel apiResponseModel = mapper.readValue( a, ApiResponseModel.class);
        System.out.println(apiResponseModel.toString());

    }

}
