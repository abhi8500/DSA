package org.DSA.LinkedList;

public class MiddleNode {
    public static ListNode linkedListMiddle(ListNode A){

        if(A == null){
            return null;
        }

        ListNode slowP = A;
        ListNode fastP = A;

        while(fastP.next != null && fastP.next.next != null){
            slowP = slowP.next;
            fastP = fastP.next.next;
        }

        return A;
    }
}
