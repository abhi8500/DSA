package org.LLD.DesignPatterns.Adaptor.Concept.WithAdaptor;

public class BankAPIFactory {

    public static BankApi getBankAPI(String bankAPIName) {
        if(bankAPIName.equals("YesBank")) {
            return new YesBankAPIAdapter();
        } else if (bankAPIName.equals("ICICIBank")) {
            return new ICICIBankAPIAdapter();
        } else {
            throw new IllegalArgumentException("Your Bank is not available at the moment");
        }
    }
}
