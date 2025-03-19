package org.LLD.DesignPatterns.Factory.DocumentAbstractFactory.parser;

import org.LLD.DesignPatterns.Factory.DocumentAbstractFactory.DocumentType;

public abstract class DocumentParser {

    private String path;

    DocumentParser(String path){
        this.path = path;
    }

    public String getPath(){
        return path;
    }

    public abstract DocumentType supportsType();
    public abstract void parseDocument();


}
