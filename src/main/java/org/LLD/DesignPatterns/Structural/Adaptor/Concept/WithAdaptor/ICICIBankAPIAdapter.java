package org.LLD.DesignPatterns.Structural.Adaptor.Concept.WithAdaptor;

public class ICICIBankAPIAdapter implements BankApi{

    ICICIBankAPI iciciBankAPI = new ICICIBankAPI();


    @Override
    public int checkBalance() {
        return iciciBankAPI.checkBalance();
    }

    @Override
    public void transferMoney() {
        iciciBankAPI.transferMoney();
    }
}
