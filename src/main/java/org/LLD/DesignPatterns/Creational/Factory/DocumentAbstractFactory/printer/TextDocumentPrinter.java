package org.LLD.DesignPatterns.Creational.Factory.DocumentAbstractFactory.printer;

import org.LLD.DesignPatterns.Creational.Factory.DocumentAbstractFactory.DocumentType;
import org.LLD.DesignPatterns.Creational.Factory.DocumentAbstractFactory.proccessor.DocumentProcessor;

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