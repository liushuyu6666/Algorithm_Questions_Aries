package ZZTrashBin;

import ZZTrashBin.TreeNode;

public class Maximum_depth_of_binary_tree {
    public int maxDepth(TreeNode root){
        if(root != null){
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);
            return Math.max(left, right) + 1;
        }
        return 0;
    }
}
