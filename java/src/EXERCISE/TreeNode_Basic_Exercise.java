package EXERCISE;

import BinaryTree.*;

import java.util.*;

public class TreeNode_Basic_Exercise {

    public List<Integer> breadthFirstSearch(TreeNode root){
        List<Integer> traversal = new ArrayList<>();
        return traversal;
    }

    public List<Integer> preOrder(TreeNode root){
        List<Integer> traversal = new ArrayList<>();
        return traversal;
    }

    public List<Integer> inOrder(TreeNode root){
        List<Integer> traversal = new LinkedList<>();
        return traversal;
    }

    public List<Integer> postOrder(TreeNode root){
        List<Integer> traversal = new LinkedList<>();
        return traversal;
    }

    public int maxDepth(TreeNode root){
        int ans = 0;
        return ans;
    }

    public boolean isSymmetric(TreeNode root){
        return false;
    }

    public boolean isValidBST(TreeNode root){
        return true;
    }

    public static void main(String args[]){
        TreeNode treeNode = new TreeNode();
        TreeNode root = treeNode.createTreeNode(new Integer[]{1, 2, 3, 4, 5, 6, 7,
                8, 9, null, 10, null, 11, 13});

        TreeNode_Basic_Exercise test = new TreeNode_Basic_Exercise();
        Maximum_Depth_of_Binary_Tree maxDepth = new Maximum_Depth_of_Binary_Tree();
        Symmetric_Tree symmetric_tree = new Symmetric_Tree();
        Validate_Binary_Search_Tree validate_binary_search_tree =
                new Validate_Binary_Search_Tree();
        TreeNode_Basic basic = new TreeNode_Basic();

        System.out.println("result of bfs: " + test.breadthFirstSearch(root).equals(
                basic.breadthFirstTraversal(root)));
        System.out.println("result of pre-order:  "+ test.preOrder(root).equals(
                basic.preOrderDepthFirstTraversal(root)
        ));
        System.out.println("result of in-order: " + test.inOrder(root).equals(
                basic.inOrderDepthFirstTraversal(root)
        ));
        System.out.println("result of post order: " + test.postOrder(root).equals(
                basic.postOrderDepthFirstTraversal(root)
        ));
        System.out.println("result of max depth: " +
                (test.maxDepth(root) == maxDepth.maxDepth(root)));
        System.out.println("result of symmetric tree: " +
                (test.isSymmetric(root) == symmetric_tree.isSymmetric(root)));
        System.out.println("result of BST: " +
                (test.isValidBST(root) == validate_binary_search_tree.isValidBST(root)));
    }
}
