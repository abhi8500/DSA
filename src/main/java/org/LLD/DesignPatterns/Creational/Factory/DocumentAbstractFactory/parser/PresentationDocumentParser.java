package org.LLD.DesignPatterns.Creational.Factory.DocumentAbstractFactory.parser;

import org.LLD.DesignPatterns.Creational.Factory.DocumentAbstractFactory.DocumentType;

public class PresentationDocumentParser extends DocumentParser{

    PresentationDocumentParser(String path){
        super(path);
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.PRESENTATION;
    }

    @Override
    public void parseDocument() {
        System.out.println("Parsing Presentation Document");
    }


}
