package org.LLD.DesignPatterns.Structural.Adaptor.Concept.WithoutAdaptor;

public class PhonePe {

    /**
     * Here in this phonepe API we are tightly coupled with YES Bank API
     * If suddenly we want to change to ICICI Bank API then we have to change the logic at many places
     *
     */
    YesBankAPI yb = new YesBankAPI();
    PhonePeLoan phonePeLoan = new PhonePeLoan();
    FastTagRecharge fastTagRecharge = new FastTagRecharge();

    boolean checkLoanEligibility(){
        return phonePeLoan.loanCheck(yb);
    }

    boolean fastTagRecharge(int amount){
        if(fastTagRecharge.recharge(yb,amount)>=0){
            System.out.println("Recharge SuccessFull");
            return true;
        }else{
            return false;
        }
    }
}
