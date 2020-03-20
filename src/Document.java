import java.util.TreeMap;

public class Document {
    protected int ID;
    protected String name;
    protected TreeMap<String, String> tags=new TreeMap<String, String>();
    protected String path;
    protected String link;

    public Document(int ID, String name, TreeMap<String, String> tags, String path, String link) {
        this.ID = ID;
        this.name = name;
        this.tags = tags;
        this.path = path;
        this.link = link;
    }
}
