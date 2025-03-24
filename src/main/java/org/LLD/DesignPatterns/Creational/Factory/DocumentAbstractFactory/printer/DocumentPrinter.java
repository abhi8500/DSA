package org.LLD.DesignPatterns.Creational.Factory.DocumentAbstractFactory.printer;

import org.LLD.DesignPatterns.Creational.Factory.DocumentAbstractFactory.DocumentType;
import org.LLD.DesignPatterns.Creational.Factory.DocumentAbstractFactory.proccessor.DocumentProcessor;

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
