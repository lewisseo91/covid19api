package model;

import util.APIRequest;

public class ApiRequestModel {

    private String URL;

    public ApiRequestModel(int numOfRows, int pageNo, int startCreate_dt, int endCreateDt) {
        this.URL = url(numOfRows, pageNo, startCreate_dt, endCreateDt);
    }

    public ApiRequestModel(CovidUrl covidUrl) {
        this.URL = url(covidUrl.getNumOfRows(),  covidUrl.getPageNo(), covidUrl.getStartCreate_dt(), covidUrl.getEndCreateDt());
        System.out.println(URL);
    }

    public String requestURL() {
        try {
            return APIRequest.getApiRequest(this.URL);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private String url(int numOfRows, int pageNo, int startCreate_dt, int endCreateDt) {
        return CovidUrl.URL_BASE +
                "?serviceKey=" + CovidUrl.SERVICE_KEY +
                "&numOfRows=" + numOfRows +
                "&pageNo=" + pageNo +
                "&startCreate_dt=" + startCreate_dt +
                "&endCreateDt=" + endCreateDt;
    }


}
