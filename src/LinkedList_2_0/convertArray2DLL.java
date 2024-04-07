package LinkedList_2_0;

import java.util.List;

public class convertArray2DLL {
    private static ListNode covertTo2DLL(int[] arr) {
        ListNode head = new ListNode(arr[0]);
        ListNode prev = head;

        for (int i = 1; i < arr.length; i++) {
           // ListNode temp = new ListNode(arr[i], null, prev);
        }
        return head;
    }

    private static void print(ListNode head) {
        while (head != null) {
            System.out.println(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}
