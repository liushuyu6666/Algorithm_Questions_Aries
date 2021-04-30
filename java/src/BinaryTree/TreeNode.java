package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
    public Integer val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode() {}
    TreeNode(Integer val) { this.val = val; }
    TreeNode(Integer val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public TreeNode createTreeNode(Integer[] nums){
        if(nums.length < 1) return null;
        if(nums[0] == null) return null;
        TreeNode root = new TreeNode(nums[0]);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        TreeNode curr;
        int i = 1;
        while(i < nums.length){
            curr = q.poll();
            if (nums[i] == null) {
                curr.left = new TreeNode(null);
            } else {
                curr.left = new TreeNode(nums[i]);
                q.add(curr.left);
            }
            i++;
            if(i < nums.length){
                if(nums[i] == null){
                    curr.right = new TreeNode(null);
                }else{
                    curr.right = new TreeNode(nums[i]);
                    q.add(curr.right);
                }
                i++;
            }
        }
        return root;
    }
}
