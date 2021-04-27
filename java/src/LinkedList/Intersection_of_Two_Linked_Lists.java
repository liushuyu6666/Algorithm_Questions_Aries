package LinkedList;

import LinkedList.ListNode;

public class Intersection_of_Two_Linked_Lists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB){
        int countA = 0, countB = 0;
        ListNode lA = headA, lB = headB;
        while(lA != null){
            countA++;
            lA = lA.next;
        }
        while(lB != null){
            countB++;
            lB = lB.next;
        }
        if(countA == 0 || countB == 0){
            return null;
        }
        lA = headA;
        lB = headB;
        if(countA >= countB){
            int diff = countA - countB;
            while(diff > 0){
                lA = lA.next;
                diff--;
            }
            while(lA != lB){
                lA = lA.next;
                lB = lB.next;
            }
        }
        if(countB >= countA){
            int diff = countB - countA;
            while(diff > 0){
                lB = lB.next;
                diff--;
            }
            while(lA != lB){
                lA = lA.next;
                lB = lB.next;
            }
        }
        return lA;
    }
}
