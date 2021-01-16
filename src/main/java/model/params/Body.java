package model.params;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.testng.annotations.Test;

public class Body {
    @JsonProperty("items")
    private Items items;
    @JsonProperty("numOfRows")
    private int numOfRows;
    @JsonProperty("pageNo")
    private int pageNo;
    @JsonProperty("totalCount")
    private int totalCount;

    @Override
    public String toString() {
        return "Body{" +
                "items=" + items.toString() +
                ", numOfRows=" + numOfRows +
                ", pageNo=" + pageNo +
                ", totalCount=" + totalCount +
                '}';
    }
}
