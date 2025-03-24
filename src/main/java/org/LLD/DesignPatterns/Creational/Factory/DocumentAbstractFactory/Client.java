package org.LLD.DesignPatterns.Creational.Factory.DocumentAbstractFactory;

import org.LLD.DesignPatterns.Creational.Factory.DocumentAbstractFactory.proccessor.DocumentProcessor;

public class Client {

    public static void main(String[] args) {
        DocumentType documentType = DocumentType.TEXT;
        DocumentFactory documentFactory = SimpleDocumentFactory.createDocumentFactory(documentType);

        documentFactory.createDocumentParser("/D:/downloads");
        DocumentProcessor documentProcessor = documentFactory.createDocumentProcessor("Text.pdf");
        documentProcessor.getDocumentName();
        documentProcessor.processDocument();
        documentFactory.createDocumentPrinter(documentProcessor);
    }
}
