package AbstractFactory.DocumentProcessing;

import AbstractFactory.DocumentProcessing.Parser.DocumentParser;
import AbstractFactory.DocumentProcessing.Parser.SpreadsheetDocumentParser;
import AbstractFactory.DocumentProcessing.Printer.DocumentPrinter;
import AbstractFactory.DocumentProcessing.Printer.SpreadsheetDocumentPrinter;
import AbstractFactory.DocumentProcessing.Processor.DocumentProcessor;
import AbstractFactory.DocumentProcessing.Processor.SpreadsheetDocumentProcessor;

public class SpreadsheetDocumentFactory extends DocumentFactory {

    @Override
    public DocumentProcessor getProcessor(String documentName) {
        return new SpreadsheetDocumentProcessor(documentName);
    }

    @Override
    public DocumentParser getParser(String path) {
        return new SpreadsheetDocumentParser(path);
    }

    @Override
    public DocumentPrinter getPrinter(DocumentProcessor processor) {
        return new SpreadsheetDocumentPrinter(processor);
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.SPREAD_SHEET;
    }
}
