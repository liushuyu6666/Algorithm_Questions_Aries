package LinkedList;

public class ListNode {
    public int val;
    public ListNode next;

    ListNode() {}
    ListNode(int x) {
        this.val = x;
    }
    ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }
}
