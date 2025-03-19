package org.LLD.DesignPatterns.Factory.DocumentAbstractFactory.printer;

import org.LLD.DesignPatterns.Factory.DocumentAbstractFactory.DocumentType;
import org.LLD.DesignPatterns.Factory.DocumentAbstractFactory.proccessor.DocumentProcessor;

public class SpreadsheetDocumentPrinter extends DocumentPrinter {

    public SpreadsheetDocumentPrinter(DocumentProcessor processor) {
        super(processor);
    }

    public void printDocument() {
        // Print spreadsheet document
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.SPREAD_SHEET;
    }
}