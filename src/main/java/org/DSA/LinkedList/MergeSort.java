package org.DSA.LinkedList;

public class MergeSort {

    public static void main(String[] args){
        ListNode head = new ListNode(10);
        ListNode current = head;           // Use 'current' to track the current position in the list

        // Insert the second node
        current.next = new ListNode(2);
        current = current.next;  // Move 'current' to the next node

        // Insert the third node
        current.next = new ListNode(5);
        current = current.next;  // Move 'current' to the next node

        // Insert the fourth node
        current.next = new ListNode(7);

        head = MergeSort.sortList(head);

        ListNode curr = head;

        while (curr != null){
            System.out.println(curr.val);
            curr = curr.next;
        }
    }

    public static  ListNode sortList(ListNode A) {

        if(A == null || A.next == null){
            return A;
        }

        ListNode mid = MiddleNode.linkedListMiddle(A);
        ListNode node2 = mid.next;

        mid.next = null;

        ListNode merge1 = sortList(A);

        ListNode merge2 = sortList(node2);

        return MergeLists.mergeTwoLists(merge1,merge2);

    }

}
