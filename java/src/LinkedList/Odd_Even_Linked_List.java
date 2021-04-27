package LinkedList;

public class Odd_Even_Linked_List {
    public ListNode oddEvenList(ListNode head){
        ListNode curr = head;
        boolean isOdd = true;
        ListNode oddHeader = new ListNode();
        ListNode oddCurr = oddHeader;
        ListNode evenHeader = new ListNode();
        ListNode evenCurr = evenHeader;
        while(curr != null){
            if(isOdd){
                oddCurr.next = new ListNode();
                oddCurr = oddCurr.next;
                oddCurr.val = curr.val;
                isOdd = false;
            }
            else{
                evenCurr.next = new ListNode();
                evenCurr = evenCurr.next;
                evenCurr.val = curr.val;
                isOdd = true;
            }
            curr = curr.next;
        }
        if(oddHeader.next != null){
            oddCurr.next = evenHeader.next;
        }
        return oddHeader.next;
    }
}
