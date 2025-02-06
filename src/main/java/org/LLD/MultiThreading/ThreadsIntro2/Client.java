package org.LLD.MultiThreading.ThreadsIntro2;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i=1;i<=n;i++){
            Runnable tableCreator = new TableCreator(i);
            Thread currentThread = new Thread(tableCreator);
            currentThread.start();
        }
    }
}
