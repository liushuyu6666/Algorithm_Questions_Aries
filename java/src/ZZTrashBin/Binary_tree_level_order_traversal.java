package ZZTrashBin;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Binary_tree_level_order_traversal {
    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> l = new ArrayList<>();
        if(root == null) return l;
        List<Integer> p1;
        List<Integer> p2;
        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();
        TreeNode t1, t2;
        q1.add(root);

        while(!q1.isEmpty() || !q2.isEmpty()){
            p1 = new ArrayList<>();
            p2 = new ArrayList<>();
            // unfold q1 and add to q2
            while(!q1.isEmpty()){
                t1 = q1.remove();
                p1.add(t1.val);
                if(t1.left != null){
                    q2.add(t1.left);
                }
                if(t1.right != null){
                    q2.add(t1.right);
                }
            }
            //unfold q2 and add to q1
            while(!q2.isEmpty()){
                t2 = q2.remove();
                p2.add(t2.val);
                if(t2.left != null){
                    q1.add(t2.left);
                }
                if(t2.right != null){
                    q1.add(t2.right);
                }
            }
            // add p1 and p2
            if(!p1.isEmpty()){
                l.add(p1);
            }
            if(!p2.isEmpty()){
                l.add(p2);
            }
        }
        return l;
    }

    public static void main(String args[]){
        Integer[] nums = {1, 2, 2, 3, 4, 4, 3};
        TreeNode tn = new TreeNode();
        tn = tn.createTreeNode(nums);
        Binary_tree_level_order_traversal s = new Binary_tree_level_order_traversal();
        List<List<Integer>> l = s.levelOrder(tn);
        for(List<Integer> x:l){
            System.out.println(x.toString());
        }
    }
}
