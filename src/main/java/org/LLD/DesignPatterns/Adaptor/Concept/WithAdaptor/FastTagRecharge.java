package org.LLD.DesignPatterns.Adaptor.Concept.WithAdaptor;


public class FastTagRecharge {

    int recharge(BankApi bankApi, int amount){
        if (bankApi.checkBalance() >= amount){
            System.out.println("Recharge Successfully");
            return 1;
        }
        return 0;
    }
}
