package org.LLD.DesignPatterns.Structural.Adaptor.Concept.WithoutAdaptor;

public class PhonePeLoan {

    public boolean loanCheck(YesBankAPI yb){
        if (yb.getBalance() >= 0){
            return true;
        }
        return false;
    }
}
