import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Catalog  implements Serializable {
    private String name;
    private String path;
    private List<Document> documents = new ArrayList<>();

    public Catalog(String java_resources, String s) {
        this.path = s;
    }
    public void add(Document doc) {
        documents.add(doc);
    }
    public Document findById(String id) {
        for (Document doc : documents) {
            if (doc.getID().equals(id)) {
                return doc;
            }
        }
        return null;
    }

    public String getPath() {
        return path;
    }
}
