package org.LLD.DesignPatterns.Adaptor.Concept.WithAdaptor;

public class ICICIBankAPI {

    ICICIBankAPI(){
    }

    int transferAmount = 0;

    public int checkBalance(){
        return 100;
    }

    public void transferMoney(){
        System.out.println("Money is transferred via Yes Bank!");
    }

    public void setTransferAmount(int amount){
        transferAmount = amount;
    }
}
