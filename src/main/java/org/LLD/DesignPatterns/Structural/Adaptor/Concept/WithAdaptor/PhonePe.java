package org.LLD.DesignPatterns.Structural.Adaptor.Concept.WithAdaptor;



public class PhonePe {

    /**
     * Here in this phonepe API we are loosely coupled with YES Bank API through BankAPI Interface
     *
     */

    BankApi bankApi;
    PhonePe(BankApi bankApi){
        this.bankApi = bankApi;
    }

    PhonePeLoan phonePeLoan = new PhonePeLoan();
    FastTagRecharge fastTagRecharge = new FastTagRecharge();

    boolean checkLoanEligibility(){

        return phonePeLoan.loanCheck(bankApi);
    }

    boolean fastTagRecharge(int amount){
        if(fastTagRecharge.recharge(bankApi,amount)>=0){
            System.out.println("Recharge SuccessFull");
            return true;
        }else{
            return false;
        }
    }
}
