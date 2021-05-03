package BinaryTree;

import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length < 1) return null;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < inorder.length; i++){
            map.put(inorder[i], i);
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode root = new TreeNode(preorder[0]);
        stack.push(root);

        for(int i = 1; i < preorder.length; i++){
            int value = preorder[i];
            TreeNode node = new TreeNode(value);
            if(map.get(value) < map.get(stack.peek().val)){
                stack.peek().left = node;
            }
            else{
                TreeNode parent = null;
                while(!stack.isEmpty() && map.get(value) > map.get(stack.peek().val)){
                    parent = stack.pop();
                }
                parent.right = node;
            }
            stack.push(node);
        }
        return root;
    }

    public static void main(String args[]){
        int[] preorder = new int[]{3,9,20,15,7};
        int[] inorder = new int[]{9,3,15,20,7};
        Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal s =
                new Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal();
        TreeNode root = s.buildTree(preorder, inorder);
        TreeNode_Basic treeNode_basic = new TreeNode_Basic();
        List<Integer> traversal = treeNode_basic.breadthFirstTraversal(root);
        System.out.println(traversal);
    }
}
