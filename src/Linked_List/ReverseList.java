package Linked_List;

public class ReverseList {
    public ListNode reverseList(ListNode head) {
       ListNode prev = null;
       ListNode curr = null;
       ListNode temp = head;
       while (temp != null) {
           curr = temp;
           temp = temp.next;
           curr.next = prev;
           prev = curr;
       }
       return curr;
    }
}
