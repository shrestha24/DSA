package Linked_List;

public class Remove_Nth_node {
    public ListNode removeNthFromEnd(ListNode head, int n){
        ListNode start = new ListNode();
        ListNode fast = start;
        ListNode slow = start;

        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        while (fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return head;
    }

}
