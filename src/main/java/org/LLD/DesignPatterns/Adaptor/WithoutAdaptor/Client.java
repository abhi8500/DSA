package org.LLD.DesignPatterns.Adaptor.WithoutAdaptor;

public class Client {
    public static void main(String[] args) {
        PhonePe ph = new PhonePe();
        ph.checkLoanEligibility();
    }
}
