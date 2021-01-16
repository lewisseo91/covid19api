package model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Abc")
public class RequestModel {

    @JsonProperty("x")
    private int x;
    @JsonProperty("y")
    private int y;

    @Override
    public String toString() {
        return "RequestModel{" +
                "x='" + x + '\'' +
                ", y='" + y + '\'' +
                '}';
    }
}
