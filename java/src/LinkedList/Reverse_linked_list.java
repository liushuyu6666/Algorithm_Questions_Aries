package LinkedList;

public class Reverse_linked_list {
    public ListNode reverseList(ListNode head){
        if(head == null) return null;
        if(head.next == null) return head;

        ListNode prev = head, curr = prev.next, next = curr.next;

        prev.next = null;
        while(next != null){
            curr.next = prev;
            prev = curr;
            curr = next;
            next = next.next;
        }
        curr.next = prev;

        return curr;
    }

    public static void main(String args[]){
        ListNode l = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)))));

        Reverse_linked_list s = new Reverse_linked_list();
        ListNode rl = s.reverseList(l);
        while(rl != null){
            System.out.println(rl.val);
            rl = rl.next;
        }
    }
}
