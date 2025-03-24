package org.LLD.DesignPatterns.Structural.Adaptor.Concept.WithoutAdaptor;

public class Client {
    public static void main(String[] args) {
        PhonePe ph = new PhonePe();
        ph.checkLoanEligibility();
    }
}
