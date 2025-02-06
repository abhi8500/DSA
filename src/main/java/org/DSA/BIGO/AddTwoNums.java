package org.DSA.BIGO;


public class AddTwoNums {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int digit1 = (l1 != null) ? l1.val : 0;
            int digit2 = (l2 != null) ? l2.val : 0;

            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            ListNode newNode = new ListNode(digit);
            tail.next = newNode;
            tail = tail.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        ListNode result = dummyHead.next;

        return result;

    }

    public static void main(String[] args){
        ListNode l3 = new ListNode(3,null);
        ListNode l2 = new ListNode(4,l3);
        ListNode l1 = new ListNode(2,l2);

        ListNode l6 = new ListNode(4,null);
        ListNode l5 = new ListNode(6,l6);
        ListNode l4 = new ListNode(5,l5);

        AddTwoNums.addTwoNumbers(l1,l4);
    }
}

 class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
