package model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import model.params.Body;
import model.params.Header;

@JacksonXmlRootElement(localName = "response")
public class ApiResponseModel {

    @JsonProperty("header")
    private Header header;

    @JsonProperty("body")
    private Body body;

    @Override
    public String toString() {
        return "ApiResponseModel{" +
                "header='" + header.toString() + '\'' +
                "body='" + body.toString() + '\''  +
                '}';
    }

    public boolean isOk() {
        return header.getResultCode() == ResponseCode.SUCCESS.getValue();
    };
}
