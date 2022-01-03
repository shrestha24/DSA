package Linked_List;

public class isPalindrome {
    public boolean isPalindrome(ListNode head){
        if (head == null && head.next == null)
            return true;

        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = reverseList(slow.next);

        slow = slow.next;

        while (slow != null){
            if (head.val != slow.val)
                return false;
            head = head.next;
            slow = slow.next;
        }
        return true;
    }

    ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode next = null;
        while (head != null){
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev
    }
}
