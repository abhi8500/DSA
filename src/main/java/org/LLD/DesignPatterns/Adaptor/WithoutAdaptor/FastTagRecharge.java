package org.LLD.DesignPatterns.Adaptor.WithoutAdaptor;

public class FastTagRecharge {

    int recharge(YesBankAPI yb,int amount){
        if (yb.getBalance() >= amount){
            System.out.println("Recharge Successfully");
            return 1;
        }
        return 0;
    }
}
