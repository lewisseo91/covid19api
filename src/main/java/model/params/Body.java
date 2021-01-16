package model.params;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.testng.annotations.Test;

public class Body {
    @JsonProperty("items")
    private Items items;

    @Override
    public String toString() {
        return "Body{" +
                "items=" + items.toString() +
                '}';
    }
}
