package DataStructure;

import java.util.Iterator;
import java.util.Stack;

public class Basic_Stack {

    public static void main(String args[]){
        Stack<Integer> stack = new Stack<>();
        int[] shot = new int[]{1, 2, 3, 5, 7};
        for(int s : shot){
            stack.push(s);
        }

        Iterator iter = stack.iterator();
        int min = (int) iter.next();
        while(iter.hasNext()){
            min = Math.min(min, (int)iter.next());
        }

    }
}
