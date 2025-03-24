package org.LLD.DesignPatterns.Creational.Factory.DocumentAbstractFactory.parser;

import org.LLD.DesignPatterns.Creational.Factory.DocumentAbstractFactory.DocumentType;

public class SpreadSheetDocumentParser extends DocumentParser{

    public SpreadSheetDocumentParser(String path){
        super(path);
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.SPREAD_SHEET;
    }

    @Override
    public void parseDocument() {
        System.out.println("Parsing spread sheet document");
    }


}
