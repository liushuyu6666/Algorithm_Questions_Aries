import java.util.Stack;

public class Inorder_successor_in_BST {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        TreeNode prev = null;
        while(true){
            if(curr.val < p.val){
                curr = curr.right;
            }
            else if(curr.val > p.val){
                prev = curr;
                curr = curr.left;
            }
            else{
                if(curr.right == null) return prev;
                curr = curr.right;
                while(curr.left != null){
                    curr = curr.left;
                }
                return curr;
            }
        }
    }
}
