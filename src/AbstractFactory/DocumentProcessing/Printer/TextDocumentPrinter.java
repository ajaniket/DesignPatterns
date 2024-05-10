package AbstractFactory.DocumentProcessing.Printer;

import AbstractFactory.DocumentProcessing.Processor.DocumentProcessor;
import AbstractFactory.DocumentProcessing.DocumentType;

public class TextDocumentPrinter extends DocumentPrinter {

    public TextDocumentPrinter(DocumentProcessor processor) {
        super(processor);
    }

    public void printDocument() {
        // Print text document
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.TEXT;
    }
}