package ZZTrashBin;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    // rain
    public TreeNode createTreeNode(Integer[] nums){
        if(nums.length < 1) return null;
        TreeNode r = new TreeNode();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(r);
        int i = 0;

        while(i < nums.length){

            // if nums[i] == null, q.remove() must be null as well
            if(nums[i] == null){
                i++;
                q.remove();
                continue;
            }

            // get the ZZTrashBin.TreeNode from q
            TreeNode t = q.remove();
            int s = q.size();
            t.val = nums[i].intValue();
            // add left child node
            if(i + s + 1 < nums.length && nums[i + s + 1] != null){
                t.left = new TreeNode();
                q.add(t.left);
            }
            else if(i + s + 1 < nums.length && nums[i + s + 1] == null){
                q.add(null);
            }
            // add right child node
            if(i + s + 2 < nums.length && nums[i + s + 2] != null){
                t.right = new TreeNode();
                q.add(t.right);
            }
            else if(i + s + 1 < nums.length && nums[i + s + 2] == null){
                q.add(null);
            }
            i++;
        }
        return r;
    }

    // rain
    public Queue<Integer> printBreadthFirstSearch(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        Queue<Integer> ans = new LinkedList<>();
        if(root != null){
            q.add(root);
        }
        else return null;

        while(!q.isEmpty()){
            TreeNode tn = q.remove();
            if(tn == null){
                ans.add(null);
                continue;
            }
            ans.add(new Integer(tn.val));
            q.add(tn.left);
            q.add(tn.right);
        }

        return ans;
    }

    public static void main(String args[]){
        Integer[] nums = {5, 1, 4, null, null, 3, 6};
        TreeNode treeNode = new TreeNode();
        TreeNode t = treeNode.createTreeNode(nums);
        Queue<Integer> ans = treeNode.printBreadthFirstSearch(t);

        Integer w;
        while(!ans.isEmpty()){
            w = ans.remove();
            System.out.println(w);
        }
    }
}
