package LinkedList;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int x) {
        this.val = x;
    }
    ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }
}
