package org.LLD.DesignPatterns.Creational.Factory.DocumentAbstractFactory.parser;

import org.LLD.DesignPatterns.Creational.Factory.DocumentAbstractFactory.DocumentType;

public class TextDocumentParser extends DocumentParser{

    public TextDocumentParser(String path){
        super(path);
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.TEXT;
    }

    @Override
    public void parseDocument() {
        System.out.println("Parsing text Document");
    }
}
