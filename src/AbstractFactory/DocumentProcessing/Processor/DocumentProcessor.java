package AbstractFactory.DocumentProcessing.Processor;

import AbstractFactory.DocumentProcessing.DocumentType;

public abstract class DocumentProcessor {
    private String documentName;

    public DocumentProcessor(String documentName) {
        this.documentName = documentName;
    }

    public String getDocumentName() {
        return documentName;
    }

    public abstract void processDocument();
    public abstract DocumentType supportsType();

}