package org.DSA.SinkAStartUP;

import java.util.Scanner;

public class GameHelper {
    public int getUserInput(String prompt){
        System.out.println(prompt+": ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
