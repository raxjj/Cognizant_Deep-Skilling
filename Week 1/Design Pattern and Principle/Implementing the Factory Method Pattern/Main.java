public class Main {

    public static void main(
            String[] args) {


        DocumentFactory wordFactory =

                new WordDocumentFactory();


        DocumentFactory pdfFactory =

                new PdfDocumentFactory();


        DocumentFactory excelFactory =

                new ExcelDocumentFactory();



        Document wordDocument =

                wordFactory.createDocument();


        Document pdfDocument =

                pdfFactory.createDocument();


        Document excelDocument =

                excelFactory.createDocument();



        wordDocument.open();

        pdfDocument.open();

        excelDocument.open();

    }
}