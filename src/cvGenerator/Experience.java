package cvGenerator;

import java.util.List;

public class Experience {

    private String type;
    private List<String> items;

    public Experience(String type, List<String> items) {
        this.type = type;
        this.items = items;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

}
