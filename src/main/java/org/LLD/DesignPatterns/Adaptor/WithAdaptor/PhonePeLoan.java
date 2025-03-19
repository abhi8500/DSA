package org.LLD.DesignPatterns.Adaptor.WithAdaptor;

import org.LLD.DesignPatterns.Adaptor.WithoutAdaptor.YesBankAPI;

public class PhonePeLoan {

    public boolean loanCheck(BankApi bankApi){
        if (bankApi.checkBalance() >= 0){
            return true;
        }
        return false;
    }
}
