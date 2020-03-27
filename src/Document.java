import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;

public class Document implements Serializable {
    protected String ID;
    protected String name;
    protected Map<String, Object> tags=new TreeMap<String, Object>();
    protected String location;

    public Document(String ID, String name, String location) {
        this.ID = ID;
        this.name = name;
        this.location = location;
    }

    public void setTags(String key, Object obj) {
        tags.put(key,obj);
    }

    public String getLocation() {
        return location;
    }

    public Object getID() {
        return ID;
    }
}
