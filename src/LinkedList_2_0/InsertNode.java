package LinkedList_2_0;

import java.util.List;

public class InsertNode {

    static void PrintList( ListNode head) {
        ListNode curr = head;
        for(; curr != null ; curr = curr.next)

            System.out.println(curr.val + "-->");
        System.out.println("null");
    }

    static ListNode InsertAtFirst(int value, ListNode head) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
        return head;

    }


}
