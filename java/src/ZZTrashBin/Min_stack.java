package ZZTrashBin;

import java.util.LinkedList;

public class Min_stack {

    LinkedList<Integer> head;
    int cnt = 0;
    Integer min = null;

    public Min_stack(){
        head = new LinkedList<>();
    }

    public void push(int x){
        head.addLast(x);
        cnt++;
        if(min == null) min = x;
        else min = Math.min(min, x);
    }

    public void pop(){
        int last = head.removeLast();
        cnt--;
        if(last == min){
            int curr = cnt;
            min = null;
            while(curr != 0){
                curr--;
                if(min != null) min = Math.min(min, head.get(curr));
                else min = head.get(curr);
            }
        }
    }

    public int top(){
        return head.getLast();
    }

    public int getMin(){
        return min;
    }

    public static void main(String args[]){
        Min_stack s = new Min_stack();
        s.push(-2);
        s.push(0);
        s.push(-3);
        s.getMin();
        s.pop();
        s.top();
        System.out.println(s.getMin());
    }
}
