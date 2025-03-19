package org.LLD.DesignPatterns.Factory.DocumentAbstractFactory;

import org.LLD.DesignPatterns.Factory.DocumentAbstractFactory.parser.DocumentParser;
import org.LLD.DesignPatterns.Factory.DocumentAbstractFactory.printer.DocumentPrinter;
import org.LLD.DesignPatterns.Factory.DocumentAbstractFactory.proccessor.DocumentProcessor;

public abstract class DocumentFactory {

    public abstract DocumentType supportsType();
    public abstract DocumentProcessor createDocumentProcessor(String documentName);
    public abstract DocumentParser createDocumentParser(String path);
    public abstract DocumentPrinter createDocumentPrinter(DocumentProcessor processor);

}
