package org.LLD.DesignPatterns.Creational.Factory.DocumentAbstractFactory.proccessor;

import org.LLD.DesignPatterns.Creational.Factory.DocumentAbstractFactory.DocumentType;

public abstract class DocumentProcessor {

    private String documentName;

    public DocumentProcessor(String documentName) {
        this.documentName = documentName;
    }

    public String getDocumentName() {
        return documentName;
    }

    public abstract void processDocument();

    public abstract DocumentType supportsType();
}
