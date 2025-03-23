package org.LLD.DesignPatterns.Adaptor.Concept.WithAdaptor;

public class YesBankAPIAdapter implements BankApi{
    YesBankAPI yb = new YesBankAPI();

    @Override
    public int checkBalance() {
        return yb.getBalance();
    }

    @Override
    public void transferMoney() {
        yb.moneyTransfer();
    }
}
