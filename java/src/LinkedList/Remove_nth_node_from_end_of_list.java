package LinkedList;

public class Remove_nth_node_from_end_of_list {
    public ListNode removeNthFromEnd(ListNode head, int n){
        if(head == null) return null;
        ListNode curr = head, last = head;

        // when n = 1
        if(n == 1){
            last = curr.next;
            if(last != null){
                while(last.next != null){
                    curr = curr.next;
                    last = last.next;
                }
                curr.next = null;
                return head;
            }
            else return null;
        }

        // when n > 1
        int i = 1;
        while(i < n && last != null){
            last = last.next;
            i++;
        }
        if(last == null) return head;

        // move current cursor to the right position
        while(last.next != null){
            curr = curr.next;
            last = last.next;
        }

        curr.val = curr.next.val;
        curr.next = curr.next.next;
        return head;

    }

    public static void main(String args[]){
        ListNode head = new ListNode(1);

        Remove_nth_node_from_end_of_list s = new Remove_nth_node_from_end_of_list();
        head = s.removeNthFromEnd(head, 1);
        ListNode l = head;
        while(l != null){
            System.out.println(l.val);
            l = l.next;
        }
    }
}
