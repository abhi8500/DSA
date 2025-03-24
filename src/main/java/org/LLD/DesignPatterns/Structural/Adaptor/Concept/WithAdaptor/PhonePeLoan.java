package org.LLD.DesignPatterns.Structural.Adaptor.Concept.WithAdaptor;

public class PhonePeLoan {

    public boolean loanCheck(BankApi bankApi){
        if (bankApi.checkBalance() >= 0){
            return true;
        }
        return false;
    }
}
