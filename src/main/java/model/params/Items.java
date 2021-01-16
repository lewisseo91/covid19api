package model.params;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.List;

public class Items {

    @JacksonXmlElementWrapper(useWrapping=false)
    public List<Item> item;

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Items{");
        for (int i = 0; i < item.size(); i++) {
            result.append(item.toString());
        }
        result.append("}");
        return result.toString();
    }
}
