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
            // determine to turn right
            if(stack.peek().val == post[j]){
                j++;
                stack.pop();
                while(stack.peek().val == post[j]){
                    j++;
                    stack.pop();
                }
                stack.peek().right = node;
            }
            else{
                stack.peek().left = node;
            }
            stack.push(node);
        }
        return root;
    }
}
