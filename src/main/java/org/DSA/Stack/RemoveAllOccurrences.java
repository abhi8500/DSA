package org.DSA.Stack;

import java.util.Stack;

public class RemoveAllOccurrences {

    public static void main(String[] args) {

        String s = "daabcbaabcbc";
        String part = "abc";

        System.out.println(removeAllOccurrences(s,part));
    }

    public static String removeAllOccurrences(String s, String part) {
        int sLen = s.length();
        int partLen = part.length();

        Stack<Character> stk = new Stack<>();

        for (int i = 0; i < sLen; i++) {
            stk.push(s.charAt(i));

            if (stk.size() >= partLen && isMatchFound(stk, part, partLen)) {
                for (int j = 0; j < partLen; j++) {
                    stk.pop();
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        while (!stk.isEmpty()) {
            sb.append(stk.pop());
        }

        return sb.reverse().toString();
    }

    private static boolean isMatchFound(Stack<Character> stk, String part, int partLen) {

        Stack<Character> temp = new Stack<>();
        temp.addAll(stk);

        for (int i = partLen - 1; i >= 0; i--) {
            if (temp.isEmpty() || temp.peek() != part.charAt(i)) {
                return false;
            }
            temp.pop();
        }

        return true;
    }
}
