import java.io.IOException;

public class Main {
    public static void main(String[] args) throws InvalidCatalogException, IOException {
        createSave();
        loadView();
    }
    private static void createSave() throws IOException {
        Catalog catalog =
                new Catalog("Java Resources", "fileTest.txt");
        Document doc = new Document("java1", "Java Course 1",
                "https://profs.info.uaic.ro/~acf/java/slides/en/intro_slide_en.pdf");
        doc.setTags("type", "Slides");
        catalog.add(doc);
        System.out.println(catalog.getPath());
        CatalogUtil.save(catalog);
    }

    private static void loadView() throws InvalidCatalogException {
        Catalog catalog = CatalogUtil.load("fileTest.txt");
        Document doc = catalog.findById("java1");
        System.out.println(doc.getID());
        CatalogUtil.view(doc);
    }
}
