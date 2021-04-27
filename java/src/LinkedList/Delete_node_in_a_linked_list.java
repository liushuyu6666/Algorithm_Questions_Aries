package LinkedList;

import LinkedList.ListNode;

public class Delete_node_in_a_linked_list {
    public void deleteNode(ListNode node){
        while(node.next != null) {
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }
}
