package ZZTrashBin;

import ZZTrashBin.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Binary_tree_zigzag_level_order_traversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<Integer> inner = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Stack<TreeNode> oddStack = new Stack<>();
        Stack<TreeNode> evenStack = new Stack<>();
        TreeNode curr = root;
        if(curr != null) oddStack.push(curr);
        else return ans;
        while(!oddStack.isEmpty() || !evenStack.isEmpty()){
            while(!oddStack.isEmpty()){
                curr = oddStack.pop();
                inner.add(curr.val);
                if(curr.left != null) evenStack.push(curr.left);
                if(curr.right != null) evenStack.push(curr.right);
            }
            if(!inner.isEmpty()) ans.add(inner);
            inner = new ArrayList<>();
            while(!evenStack.isEmpty()){
                curr = evenStack.pop();
                inner.add(curr.val);
                if(curr.right != null) oddStack.push(curr.right);
                if(curr.left != null) oddStack.push(curr.left);
            }
            if(!inner.isEmpty()) ans.add(inner);
            inner = new ArrayList<>();
        }
        return ans;
    }

    public static void main(String args[]){

    }
}
