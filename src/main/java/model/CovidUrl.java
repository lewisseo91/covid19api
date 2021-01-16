package model;

public class CovidUrl {

    public static final String URL_BASE = "http://openapi.data.go.kr/openapi/service/rest/Covid19/getCovid19SidoInfStateJson";
    public static final String SERVICE_KEY = "VXxtKr9fy4Uz1ZG%2Ff7aeMthSE9ZAIdEC7GnRQPSrSoRRNdQ7D3799DrX1FD4TLm3ZO6UGcFAGmKatAhcE96Fhw%3D%3D";

    private int numOfRows;
    private int pageNo;
    private int startCreateDt;
    private int endCreateDt;

    public CovidUrl(int numOfRows, int pageNo, int startCreate_dt, int endCreateDt) {
        this.numOfRows = numOfRows;
        this.pageNo = pageNo;
        this.startCreateDt = startCreate_dt;
        this.endCreateDt = endCreateDt;
    }

    public static String getUrlBase() {
        return URL_BASE;
    }

    public static String getServiceKey() {
        return SERVICE_KEY;
    }

    public int getNumOfRows() {
        return numOfRows;
    }

    public int getPageNo() {
        return pageNo;
    }

    public int getStartCreateDt() {
        return startCreateDt;
    }

    public int getEndCreateDt() {
        return endCreateDt;
    }
}
