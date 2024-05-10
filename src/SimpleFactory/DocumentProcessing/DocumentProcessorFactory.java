package SimpleFactory.DocumentProcessing;

public class DocumentProcessorFactory{
    public static DocumentProcessor getDocument(DocumentType type, String documentName){
        return switch (type){
            case TEXT -> new TextDocumentProcessor(documentName);
            case PRESENTATION -> new PresentationDocumentProcessor(documentName);
            case SPREAD_SHEET -> new SpreadsheetDocumentProcessor(documentName);
            default -> throw new IllegalStateException();
        };
    }
}
