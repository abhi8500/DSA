package org.LLD.DesignPatterns.Adaptor.WithAdaptor;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bankName = scanner.nextLine();

        BankApi bankApi = BankAPIFactory.getBankAPI(bankName);
        PhonePe phonePe = new PhonePe(bankApi);
        phonePe.checkLoanEligibility();
    }
}
