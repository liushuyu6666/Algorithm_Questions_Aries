package ZZTrashBin;

import java.util.Stack;

public class Valid_parentheses {
    public boolean isValid(String s){
        Stack<Character> p = new Stack<Character>();
        String left = "([{", right = ")]}";
        char inStack, inS;

        for(int i = 0; i < s.length(); i++){
            if(left.contains(Character.toString(s.charAt(i)))){
                p.push(s.charAt(i));
            }
            else{
                if(p.isEmpty()) return false;
                inStack = p.pop();
                inS = s.charAt(i);
                if(Math.abs(inStack - inS) > 2){
                    return false;
                }
            }
        }
        if(p.isEmpty()) return true;
        else return false;
    }

    public static void main(String args[]){
        Valid_parentheses s = new Valid_parentheses();
        System.out.println(s.isValid("(){[]}"));
    }
}
