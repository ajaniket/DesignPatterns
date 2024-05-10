package AbstractFactory.DocumentProcessing.Printer;

import AbstractFactory.DocumentProcessing.Processor.DocumentProcessor;
import AbstractFactory.DocumentProcessing.DocumentType;

public abstract class DocumentPrinter {

    private final DocumentProcessor processor;

    public DocumentPrinter(DocumentProcessor processor) {
        this.processor = processor;
    }

    public DocumentProcessor getProcessor() {
        return processor;
    }

    public abstract void printDocument();

    public abstract DocumentType supportsType();

}