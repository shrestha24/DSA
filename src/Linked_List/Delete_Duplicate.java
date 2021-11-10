package Linked_List;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

    public class Delete_Duplicate {
        public static ListNode deleteDuplicates(ListNode head) {
            ListNode temp = new ListNode(0);
            ListNode curr = head;
            ListNode prev = null;
            while (curr != null) {
                prev = curr;
                temp = curr.next;

                while (curr != null && prev.val == curr.val) {
                    temp = curr;
                    curr = curr.next;
                    temp.next = null;
                }
                prev.next = curr;

            }
            return head;

        }
}



