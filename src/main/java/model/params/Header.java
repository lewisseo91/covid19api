package model.params;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Header {

    @JsonProperty("resultCode")
    private int resultCode;
    @JsonProperty("resultMsg")
    private String resultMsg;

    public int getResultCode() {
        return resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    @Override
    public String toString() {
        return "Header{" +
                "resultCode=" + resultCode +
                ", resultMsg='" + resultMsg + '\'' +
                '}';
    }
}
