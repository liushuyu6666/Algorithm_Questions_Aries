package BinaryTree;

import java.util.HashMap;
import java.util.Stack;

public class Construct_Binary_Tree_from_Postorder_and_Inorder_Traversal {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(postorder.length < 1) return null;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode root = new TreeNode(postorder[postorder.length - 1]);
        stack.push(root);
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < inorder.length; i++){
            map.put(inorder[i], i);
        }

        for(int i = postorder.length - 2; i >= 0; i--){
            TreeNode node = new TreeNode(postorder[i]);
            if(map.get(postorder[i]) < map.get(stack.peek().val)){
                TreeNode curr = null;
                while(!stack.isEmpty() && map.get(postorder[i]) < map.get(stack.peek().val)){
                    curr = stack.pop();
                }
                curr.left = node;
            }
            else{
                stack.peek().right = node;
            }
            stack.push(node);
        }
        return root;
    }
}
