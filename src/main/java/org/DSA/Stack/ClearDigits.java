package org.DSA.Stack;

import java.util.Scanner;

public class ClearDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        sc.close();

        System.out.println(clearDigits(input));
    }

    public static String clearDigits(String s) {

        StringBuilder stack = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                if (!stack.isEmpty()) {
                    stack.deleteCharAt(stack.length() - 1);
                }
            } else {
                stack.append(c);
            }
        }

        return stack.toString();

    }
}
