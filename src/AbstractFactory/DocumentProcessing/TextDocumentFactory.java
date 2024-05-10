package AbstractFactory.DocumentProcessing;

import AbstractFactory.DocumentProcessing.Parser.DocumentParser;
import AbstractFactory.DocumentProcessing.Parser.TextDocumentParser;
import AbstractFactory.DocumentProcessing.Printer.DocumentPrinter;
import AbstractFactory.DocumentProcessing.Printer.TextDocumentPrinter;
import AbstractFactory.DocumentProcessing.Processor.DocumentProcessor;

public class TextDocumentFactory extends DocumentFactory{
    @Override
    public DocumentProcessor getProcessor(String documentName) {
        return new TextDocumentProcessor(documentName);
    }

    @Override
    public DocumentParser getParser(String path) {
        return new TextDocumentParser(path);
    }

    @Override
    public DocumentPrinter getPrinter(DocumentProcessor processor) {
        return new TextDocumentPrinter(processor);
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.TEXT;
    }
}
