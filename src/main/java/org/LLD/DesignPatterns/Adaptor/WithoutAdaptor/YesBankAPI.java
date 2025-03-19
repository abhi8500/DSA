package org.LLD.DesignPatterns.Adaptor.WithoutAdaptor;

public class YesBankAPI {

    public int getBalance(){
        return 100;
    }

    public void moneyTransfer(){
        System.out.println("Money is transferred via YES Bank");
    }
}
