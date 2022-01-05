package Linked_List;

public class FindStartingPointOfCycle {
    public ListNode detectCycle(ListNode head){
       if(head == null || head.next == null)
           return null;

       ListNode slow = head;
       ListNode fast = head;
       ListNode entry = head;

       while (fast.next != null && fast.next.next != null){
           slow = slow.next;
           fast = fast.next.next;
           if (slow == fast){
               while (slow != entry) {
                   slow = slow.next;
                   entry = entry.next;
               }
               return entry;
           }
       }
       return null;
    }
}
