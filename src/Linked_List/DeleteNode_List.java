package Linked_List;

public class DeleteNode_List {
    public  static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;

    }
}
