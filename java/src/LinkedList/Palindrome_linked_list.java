package LinkedList;

public class Palindrome_linked_list {
    public boolean isPalindrome(ListNode head){
        if(head == null) return true;
        int count = 0;

        // use fast-slow cursor to find the middle node
        ListNode fast = head, slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            count++;
        }
        if(count == 0) return true; // only one element
        if(fast != null && fast.next == null) slow = slow.next;

        // reverse the latter part
        ListNode prev = slow;
        slow = slow.next;
        ListNode next = null;
        if(slow != null){
            next = slow.next;
        }
        while(slow != null){
            slow.next = prev;
            prev = slow;
            slow = next;
            if(slow != null) next = slow.next;
        }

        // compare
        fast = head;
        while(count > 0){
            if(prev.val != fast.val) return false;
            prev = prev.next;
            fast = fast.next;
            count--;
        }
        return true;
    }

    public static void main(String args[]){
        ListNode l = new ListNode(1);

        Palindrome_linked_list s = new Palindrome_linked_list();
        System.out.println(s.isPalindrome(l));
    }
}

