package org.LLD.DesignPatterns.Creational.Factory.DocumentAbstractFactory;

import org.LLD.DesignPatterns.Creational.Factory.DocumentAbstractFactory.parser.DocumentParser;
import org.LLD.DesignPatterns.Creational.Factory.DocumentAbstractFactory.parser.SpreadSheetDocumentParser;
import org.LLD.DesignPatterns.Creational.Factory.DocumentAbstractFactory.printer.DocumentPrinter;
import org.LLD.DesignPatterns.Creational.Factory.DocumentAbstractFactory.printer.SpreadsheetDocumentPrinter;
import org.LLD.DesignPatterns.Creational.Factory.DocumentAbstractFactory.proccessor.DocumentProcessor;
import org.LLD.DesignPatterns.Creational.Factory.DocumentAbstractFactory.proccessor.SpreadsheetDocumentProcessor;

public class SpreadsheetDocumentFactory extends DocumentFactory {
    @Override
    public DocumentType supportsType() {
        return DocumentType.SPREAD_SHEET;
    }

    @Override
    public DocumentProcessor createDocumentProcessor(String documentName) {
        return new SpreadsheetDocumentProcessor(documentName);
    }

    @Override
    public DocumentParser createDocumentParser(String path) {
        return new SpreadSheetDocumentParser(path);
    }

    @Override
    public DocumentPrinter createDocumentPrinter(DocumentProcessor processor) {
        return new SpreadsheetDocumentPrinter(processor);
    }


}
