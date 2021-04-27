package LinkedList;

public class Merge_two_sorted_lists {
    public ListNode mergeTwoLists(ListNode h1, ListNode h2){
        if(h1 == null) return h2;
        if(h2 == null) return h1;

        ListNode curr1 = h1, curr2 = h2, next2 = curr2.next, prev1;

        // make the minimum node to be the header of list1
        if(curr2.val <= curr1.val){
            curr2.next = curr1;
            prev1 = curr2;
            h1 = curr2;
            curr2 = next2;
            if(curr2 != null) next2 = curr2.next;
        }
        else{
            h1 = curr1;
            prev1 = curr1;
            curr1 = prev1.next;
        }

        // the main part
        while(curr1 != null && curr2 != null){
            if(curr2.val <= curr1.val){
                prev1.next = curr2;
                curr2.next = curr1;
                curr1 = curr2;
                curr2 = next2;
                if(curr2 != null) next2 = curr2.next;
            }
            else{
                prev1 = curr1;
                curr1 = curr1.next;
            }
        }
        if(curr1 == null){
            prev1.next = curr2;
        }
        return h1;
    }

    public static void main(String args[]){
        ListNode l1 = new ListNode();
        ListNode l2 = new ListNode();
        Merge_two_sorted_lists s = new Merge_two_sorted_lists();
        l1 = s.mergeTwoLists(l1, l2);
        while(l1 != null){
            System.out.println(l1.val);
            l1 = l1.next;
        }
    }
}
