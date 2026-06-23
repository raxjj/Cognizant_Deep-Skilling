public class WordDocumentFactory
        extends DocumentFactory {


    Document createDocument() {

        return new WordDocument();
    }
}