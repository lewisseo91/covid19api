package controller;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import model.ApiRequestModel;
import model.ApiResponseModel;
import model.CovidUrl;

import java.io.IOException;
import java.util.List;

public class InitAPI {

    public static List<String> CovidDB;
    private static final String COVID19_API_URL = "http://openapi.data.go.kr/openapi/service/rest/Covid19/getCovid19SidoInfStateJson?serviceKey=VXxtKr9fy4Uz1ZG%2Ff7aeMthSE9ZAIdEC7GnRQPSrSoRRNdQ7D3799DrX1FD4TLm3ZO6UGcFAGmKatAhcE96Fhw%3D%3D&pageNo=1&numOfRows=10&startCreateDt=20200410&endCreateDt=20200410";

    public static void init() throws IOException {
        CovidUrl covidUrl = new CovidUrl(10, 1, 20200420, 20200420);
        ApiRequestModel request = new ApiRequestModel(covidUrl);
        String output = request.requestURL();

        XmlMapper mapper = new XmlMapper();
        ApiResponseModel apiResponseModel = mapper.readValue( output, ApiResponseModel.class);
        System.out.println(apiResponseModel.toString());

    }

    public static List<String> getCovidDB() {
        return CovidDB;
    }
}
