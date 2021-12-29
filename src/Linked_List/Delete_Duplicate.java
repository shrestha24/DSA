package Linked_List;

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



