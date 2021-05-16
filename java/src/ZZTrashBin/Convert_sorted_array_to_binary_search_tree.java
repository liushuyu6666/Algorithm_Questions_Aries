package ZZTrashBin;

import java.util.LinkedList;
import java.util.Queue;

public class Convert_sorted_array_to_binary_search_tree {
    public TreeNode sortedArrayToBST(int[] nums){
        if(nums.length < 1) return null;
        Queue<Integer> qBegin = new LinkedList<>();
        Queue<Integer> qEnd = new LinkedList<>();
        Queue<TreeNode> q = new LinkedList<>();

        // find the root val
        int i = 0, j = 0;
        while(j < nums.length - 1){
            i = i + 1;
            j = j + 2;
        }
        TreeNode root = new TreeNode(nums[i]);
        q.add(root);
        qBegin.add(0);
        qEnd.add(i - 1);
        qBegin.add(i + 1);
        qEnd.add(nums.length - 1);

        // extend an existed node
        boolean left = true;
        int begin, end, middle;
        TreeNode curr;
        while(!q.isEmpty()){
            curr = q.remove();
            // add left node
            begin = qBegin.remove();
            end = qEnd.remove();
            middle = getMiddle(begin, end);
            if(middle != -1){
                curr.left = new TreeNode(nums[middle]);
                q.add(curr.left);
                qBegin.add(begin);
                qEnd.add(middle-1);
                qBegin.add(middle+1);
                qEnd.add(end);
            }
            else{
                curr.left = null;
            }
            // add right node
            begin = qBegin.remove();
            end = qEnd.remove();
            middle = getMiddle(begin, end);
            if(middle != -1){
                curr.right = new TreeNode(nums[middle]);
                q.add(curr.right);
                qBegin.add(begin);
                qEnd.add(middle-1);
                qBegin.add(middle+1);
                qEnd.add(end);
            }
            else{
                curr.right = null;
            }
        }
        return root;
    }

    public int getMiddle(int begin, int end){
        if(begin > end) return -1;
        int i = begin, j = begin;
        while(j < end){
            i = i + 1;
            j = j + 2;
        }
        return i;
    }

    public static void main(String args[]){
        int[] nums = {0, 1, 2, 3, 4, 5};
        Convert_sorted_array_to_binary_search_tree s =
                new Convert_sorted_array_to_binary_search_tree();
        TreeNode tn = s.sortedArrayToBST(nums);
        Queue<Integer> qNum = new LinkedList<>();
        qNum = tn.printBreadthFirstSearch(tn);
        for(Integer x:qNum){
            System.out.println(x);
        }
    }
}
