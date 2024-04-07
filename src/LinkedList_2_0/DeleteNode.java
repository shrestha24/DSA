package LinkedList_2_0;

public class DeleteNode {
    static ListNode deleteNode(ListNode head) {
        if (head == null || head.next == null)
            return null;

        ListNode temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;

        return head;
    }
}
