package Linked_List;

public class Merge_Sorted_Lists {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int val) {this.val = val;}
        ListNode(int val, ListNode next) {this.val = val; this.next = next;}
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(0);
        ListNode curr = temp;
        while (l1 != null && l2 != null)
        {
            if (l1.val < l2.val)
            {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        if (l1 != null)
        {
            curr.next = l1;
            l1 =l1.next;
    }
        if (l2 != null)
        {
            curr.next = l2;
            l2= l2.next;
        }
        return temp.next;

    }
}
