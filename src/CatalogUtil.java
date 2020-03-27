import java.awt.*;
import java.io.*;

public class CatalogUtil {
    public static void save(Catalog catalog)
            throws IOException {
        try (var oos = new ObjectOutputStream(
                new FileOutputStream(catalog.getPath()))) {
            oos.writeObject(catalog);
        }
    }
    public static Catalog load(String path)
            throws InvalidCatalogException, IOException, ClassNotFoundException {
        FileInputStream saveFile = new FileInputStream(path);
        ObjectInputStream save = new ObjectInputStream(saveFile);
        return (Catalog) save.readObject();
    }
    public static void view(Document doc) throws IOException {
        Desktop desktop = Desktop.getDesktop();
        File file = new File(doc.getLocation());
        if(file.exists()) desktop.open(file);
    }
}