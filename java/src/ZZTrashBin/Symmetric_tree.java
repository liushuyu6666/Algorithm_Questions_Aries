package ZZTrashBin;

import BinaryTree.TreeNode;
import BinaryTree.TreeNode_Basic;

import java.util.LinkedList;
import java.util.Queue;

public class Symmetric_tree {
    // recursion
    public boolean isSymmetric(TreeNode root){
        if(root == null) return true;
        Queue<TreeNode> left = new LinkedList<>();
        Queue<TreeNode> right = new LinkedList<>();
        left.add(root.left);
        right.add(root.right);
        TreeNode leftCurr = root.left;
        TreeNode rightCurr = root.right;
        while(!left.isEmpty() && !right.isEmpty()){
            if(leftCurr != null && rightCurr != null){
                if(leftCurr.val != rightCurr.val) return false;
                left.add(leftCurr.left);
                left.add(leftCurr.right);
                right.add(rightCurr.right);
                right.add(rightCurr.left);
                leftCurr = left.poll();
                rightCurr = right.poll();
            }
            else if(leftCurr == null && rightCurr == null){
                leftCurr = left.poll();
                rightCurr = right.poll();
            }
            else{
                return false;
            }
        }
        if(left.isEmpty() && right.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }


    public static void main(String args[]){
        Integer[] nums = {2, 3, 3, 4, 5, 5};
        TreeNode_Basic treeNode_basic = new TreeNode_Basic();
        Symmetric_tree symmetric_tree = new Symmetric_tree();
//        ZZTrashBin.TreeNode root = treeNode_basic.createTreeNode(nums);
//        symmetric_tree.isSymmetric(root);
    }
}
