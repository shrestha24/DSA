package Linked_List;

import java.util.List;

public class FindMiddleOfLinkedList {
    public ListNode middleNode(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
