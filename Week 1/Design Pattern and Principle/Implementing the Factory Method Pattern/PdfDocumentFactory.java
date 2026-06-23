public class PdfDocumentFactory
        extends DocumentFactory {


    Document createDocument() {

        return new PdfDocument();
    }
}