package org.LLD.DesignPatterns.Factory.DocumentAbstractFactory;

public class SimpleDocumentFactory {

    public static  DocumentFactory createDocumentFactory(DocumentType documentType){

        switch (documentType){
            case TEXT ->
            {
                return new TextDocumentFactory();
            }case SPREAD_SHEET ->
            {
                return new SpreadsheetDocumentFactory();
            }default ->
                throw  new IllegalArgumentException("Please provide valid document type");
        }
    }
}
