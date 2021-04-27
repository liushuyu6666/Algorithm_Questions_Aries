package LinkedList;

public class Add_two_numbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        int carry = 0;
        ListNode h1 = l1, h2 = l2, h = new ListNode(), curr = h;
        while(h1 != null || h2 != null){
            if(h1 != null && h2 != null){
                curr.next = new ListNode();
                curr = curr.next;
                curr.val = (carry + h1.val + h2.val) % 10;
                carry = (carry + h1.val + h2.val) / 10;
                h1 = h1.next;
                h2 = h2.next;
            }
            else if(h1 != null){
                curr.next = new ListNode();
                curr = curr.next;
                curr.val = (carry + h1.val) % 10;
                carry = (carry + h1.val) / 10;
                h1 = h1.next;
            }
            else{
                curr.next = new ListNode();
                curr = curr.next;
                curr.val = (carry + h2.val) % 10;
                carry = (carry + h2.val) / 10;
                h2 = h2.next;
            }
        }
        if(carry != 0){
            curr.next = new ListNode();
            curr = curr.next;
            curr.val = carry;
            curr.next = null;
        }
        return h.next;
    }
    public static void main(String args[]){
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3, null)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4, null)));
        Add_two_numbers s = new Add_two_numbers();
        s.addTwoNumbers(l1, l2);

    }
}
