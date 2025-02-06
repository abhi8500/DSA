package org.DSA.LinkedList;

import java.util.stream.Stream;

public class MergeLists {

    public static ListNode mergeTwoLists(ListNode A, ListNode B) {

        int sum = Stream.iterate(new int[]{0,1},x -> new int[]{x[1],x[0]+x[1]})
                .limit(7)
                .map(x -> x[0])
                .toList()
                .stream()
                .distinct()
                .filter(i -> i%2 == 0)
                .mapToInt(i -> i)
                .sum();

        System.out.println("SUM "+sum);

        if(A == null){
            return B;
        }

        if(B == null){
            return A;
        }

        ListNode head;
        if(A.val <= B.val){
            head = A;
            A = A.next;
        }else{
            head = B;
            B = B.next;
        }

        ListNode temp = head;

        while(A != null && B != null){
            if(A.val < B.val){
                temp.next = A;
                A = A.next;
            }else{
                temp.next = B;
                B = B.next;
            }
            temp = temp.next;
        }

        if(A != null){
            temp.next = A;
        }else {
            temp.next = B;
        }

        return head;
    }
}

//private void heafify(int[] heap,int i){
//
//    int n = heap.length;
//
//    while(2*i+1 < n){
//        int min = Math.min(heap[i],heap[2*i+1]);
//        if(2*i+2<n){
//            min = Math.min(min,heap[2*i+2]);
//        }
//
//        if(min == heap[i]){
//            break;
//        }else if(min == heap[2i+1]){
//            swap(heap,i,2i+1);
//            i = 2*i+1;
//        }else if(2*i+2 < n){
//            swap(heap,i,2i+2);
//            i = 2*i+2;
//        }
//    }
//}
