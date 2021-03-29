import java.util.Stack;

public class Kth_smallest_element_in_a_bst {
    public int kthSmallest(TreeNode root, int k){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while(curr != null){
            stack.push(curr);
            curr = curr.left;
        }
        // now curr points to the minimum value
        int cnt = 0;
        while(true){
            curr = stack.pop();
            if(++cnt == k) return curr.val;
            if(curr.right != null){
                curr = curr.right;
                while(curr != null){
                    stack.push(curr);
                    curr = curr.left;
                }
            }
        }
    }
}
