package org.LLD.DesignPatterns.Creational.Factory.DocumentAbstractFactory;

import org.LLD.DesignPatterns.Creational.Factory.DocumentAbstractFactory.parser.DocumentParser;
import org.LLD.DesignPatterns.Creational.Factory.DocumentAbstractFactory.printer.DocumentPrinter;
import org.LLD.DesignPatterns.Creational.Factory.DocumentAbstractFactory.proccessor.DocumentProcessor;

public abstract class DocumentFactory {

    public abstract DocumentType supportsType();
    public abstract DocumentProcessor createDocumentProcessor(String documentName);
    public abstract DocumentParser createDocumentParser(String path);
    public abstract DocumentPrinter createDocumentPrinter(DocumentProcessor processor);

}
