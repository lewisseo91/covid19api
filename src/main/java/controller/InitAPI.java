package controller;

import util.APIRequest;

import java.io.IOException;
import java.util.List;

public class InitAPI {

    public static List<String> CovidDB;
    private static final String COVID19_API_URL = "http://openapi.data.go.kr/openapi/service/rest/Covid19/getCovid19SidoInfStateJson?serviceKey=VXxtKr9fy4Uz1ZG%2Ff7aeMthSE9ZAIdEC7GnRQPSrSoRRNdQ7D3799DrX1FD4TLm3ZO6UGcFAGmKatAhcE96Fhw%3D%3D&pageNo=1&numOfRows=10&startCreateDt=20200410&endCreateDt=20200410";

    public static void init() throws IOException {
        String output = APIRequest.getApiRequest(COVID19_API_URL);

        System.out.println(output);
    }

    public static List<String> getCovidDB() {
        return CovidDB;
    }
}
