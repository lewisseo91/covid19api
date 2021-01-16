import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import controller.InitAPI;
import model.RequestModel;

import java.io.IOException;
import java.util.logging.XMLFormatter;

public class Main {



    public static void main(String[] args) throws IOException {
        InitAPI.init();

        //testXML();;




    }

    public static void testXML() throws IOException {
        String a = "<Abc><x>1</x><y>2</y></Abc>";
        //String a = "<x>1</x><y>2</y>";
        String b = "<x>1</x>\n" +
                "<y>2</y>\n";
        try {
            XmlMapper mapper = new XmlMapper();
            RequestModel value = mapper.readValue(  a, RequestModel.class);
            System.out.println(value.toString());
        } catch (Exception e ) {
            e.printStackTrace();
        }

    }

}
