package model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Header {

    @JsonProperty("resultCode")
    private int resultCode;
    @JsonProperty("resultMsg")
    private String resultMsg;
}
