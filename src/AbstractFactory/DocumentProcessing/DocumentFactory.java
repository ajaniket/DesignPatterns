package AbstractFactory.DocumentProcessing;

import AbstractFactory.DocumentProcessing.Parser.DocumentParser;
import AbstractFactory.DocumentProcessing.Printer.DocumentPrinter;
import AbstractFactory.DocumentProcessing.Processor.DocumentProcessor;

public abstract class DocumentFactory {
    public abstract DocumentProcessor getProcessor(String documentName);
    public abstract DocumentParser getParser(String path);
    public abstract DocumentPrinter getPrinter(DocumentProcessor processor);

    public abstract DocumentType supportsType();
}