package Linked_List;

public class RemoveLLElements {
    public ListNode removeElements(ListNode head, int val) {

        if(head == null)
            return head;

        ListNode temp = new ListNode(0, head);
        ListNode tempHead = temp;

        while(temp.next != null){
            if(temp.next.val == val){
                temp.next = temp.next.next;
            }
            else
                temp = temp.next;
        }

      return tempHead.next;
    }

















    public ListNode removeElements1(ListNode head, int val) {
        if(head==null){
            return head;
        }
        ListNode temp = head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        while (temp != null) {
            if (temp.val == val) {
                if (temp.next == null) {
                    pre.next = null;
                } else {
                    pre.next = temp.next;
                }
            } else {
                pre = pre.next;
            }
            temp = temp.next;
        }
        return dummy.next;

    }
}
