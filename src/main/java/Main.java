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

        String a = "<response>\n" +
                "    <header>\n" +
                "        <resultCode>00</resultCode>\n" +
                "        <resultMsg>NORMAL SERVICE.</resultMsg>\n" +
                "    </header>\n" +
                "    <body>\n" +
                "        <items>\n" +
                "            <item>\n" +
                "                <createDt>2020-04-10 11:17:35.35</createDt>\n" +
                "                <deathCnt>0</deathCnt>\n" +
                "                <defCnt>352</defCnt>\n" +
                "                <gubun>검역</gubun>\n" +
                "                <gubunCn>隔離區</gubunCn>\n" +
                "                <gubunEn>Lazaretto</gubunEn>\n" +
                "                <incDec>4</incDec>\n" +
                "                <isolClearCnt>3</isolClearCnt>\n" +
                "                <isolIngCnt>349</isolIngCnt>\n" +
                "                <localOccCnt>0</localOccCnt>\n" +
                "                <overFlowCnt>4</overFlowCnt>\n" +
                "                <qurRate>-</qurRate>\n" +
                "                <seq>1014</seq>\n" +
                "                <stdDay>2020년 04월 10일 00시</stdDay>\n" +
                "                <updateDt/>\n" +
                "            </item>\n" +
                "        </items>\n" +
                "    </body>\n" +
                "</response>";

        XmlMapper mapper = new XmlMapper();
        ApiResponseModel apiResponseModel = mapper.readValue( a, ApiResponseModel.class);
        System.out.println(apiResponseModel.toString());

    }

}
