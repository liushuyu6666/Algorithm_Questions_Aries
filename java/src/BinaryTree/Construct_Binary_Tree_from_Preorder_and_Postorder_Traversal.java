package BinaryTree;

import java.util.Stack;

public class Construct_Binary_Tree_from_Preorder_and_Postorder_Traversal {
    public TreeNode constructFromPrePost(int[] pre, int[] post) {
        if(pre.length < 1) return null;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode root = new TreeNode(pre[0]);
        stack.push(root);
        int j = 0;
        for(int i = 1; i < pre.length; i++){
            TreeNode node = new TreeNode(pre[i]);
            while(stack.peek().val == post[j]){
                j++;
                stack.pop();
            }
            if(stack.peek().left == null){
                stack.peek().left = node;
            }
            else{
                stack.peek().right = node;
            }
            stack.push(node);
        }
        return root;
    }
}
