package org.LLD.DesignPatterns.Factory.DocumentAbstractFactory.printer;

import org.LLD.DesignPatterns.Factory.DocumentAbstractFactory.DocumentType;
import org.LLD.DesignPatterns.Factory.DocumentAbstractFactory.proccessor.DocumentProcessor;

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