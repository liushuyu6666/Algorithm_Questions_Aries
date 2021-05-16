package ZZTrashBin;

import ZZTrashBin.TreeNode;

import java.util.HashMap;
import java.util.Stack;

public class Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal {
    public TreeNode buildTree(int[] preorder, int[] inorder){
        if(preorder.length < 1) return null;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode root = new TreeNode(preorder[0]);
        TreeNode curr = root;
        int leftBound = 0;
        HashMap<Integer, Integer> inOrderMap = new HashMap<>();
        for(int i = 0; i < inorder.length; i++){
            inOrderMap.put(inorder[i], i);
        }

        // check if curr has left wing in the inorder array
        // if have, push it into stack
        // if not, peek the stack to see the position of the next node
        int i = 0;
        while(i < preorder.length - 1){
            // check if curr has left wing
            if(inOrderMap.get(curr.val) > leftBound){
                stack.push(curr);
                i++;
                curr.left = new TreeNode(preorder[i]);
                curr = curr.left;
            }
            // if there is no left wing
            else{
                leftBound++;
                i++;
                while(!stack.isEmpty() && inOrderMap.get(stack.peek().val) < inOrderMap.get(preorder[i])) {
                    curr = stack.pop();
                    leftBound++;
                }
                curr.right = new TreeNode(preorder[i]);
                curr = curr.right;
            }
        }
        return root;
    }
}
