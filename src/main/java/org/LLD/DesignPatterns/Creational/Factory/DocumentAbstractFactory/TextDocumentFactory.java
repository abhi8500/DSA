package org.LLD.DesignPatterns.Creational.Factory.DocumentAbstractFactory;

import org.LLD.DesignPatterns.Creational.Factory.DocumentAbstractFactory.parser.DocumentParser;
import org.LLD.DesignPatterns.Creational.Factory.DocumentAbstractFactory.parser.TextDocumentParser;
import org.LLD.DesignPatterns.Creational.Factory.DocumentAbstractFactory.printer.DocumentPrinter;
import org.LLD.DesignPatterns.Creational.Factory.DocumentAbstractFactory.printer.TextDocumentPrinter;
import org.LLD.DesignPatterns.Creational.Factory.DocumentAbstractFactory.proccessor.DocumentProcessor;
import org.LLD.DesignPatterns.Creational.Factory.DocumentAbstractFactory.proccessor.TextDocumentProcessor;

public class TextDocumentFactory extends DocumentFactory {
    @Override
    public DocumentType supportsType() {
        return DocumentType.TEXT;
    }

    @Override
    public DocumentProcessor createDocumentProcessor(String documentName) {
        return new TextDocumentProcessor(documentName);
    }

    @Override
    public DocumentParser createDocumentParser(String path) {
        return new TextDocumentParser(path);
    }

    @Override
    public DocumentPrinter createDocumentPrinter(DocumentProcessor processor) {
        return new TextDocumentPrinter(processor);
    }
}
