package model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "response")
public class ApiResponseModel {


//    @JacksonXmlElementWrapper(localName = "header", useWrapping = false)
//    @JacksonXmlProperty(localName = "resultCode")
    private int resultCode;
//
//    @JacksonXmlElementWrapper(localName = "header", useWrapping = false)
//    @JacksonXmlProperty(localName = "resultMsg")
    private String resultMsg;

    @Override
    public String toString() {
        return "ApiResponseModel{" +
                ", resultCode=" + resultCode +
                ", resultMsg='" + resultMsg + '\'' +
                '}';
    }
}
