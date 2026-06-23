public class ExcelDocumentFactory
        extends DocumentFactory {


    Document createDocument() {

        return new ExcelDocument();
    }
}