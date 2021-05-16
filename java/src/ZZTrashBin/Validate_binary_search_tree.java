package ZZTrashBin;

public class Validate_binary_search_tree {
    public boolean isValidBST(TreeNode root){
        if(root == null) return true;
        return subValidBST(root, null, null);
    }

    public boolean subValidBST(TreeNode root, Integer max, Integer min){
        if(root == null) return true;
        if(root.left != null){
            if(min == null){
                if(root.left.val >= root.val) return false;
            }
            else if(root.left.val >= root.val || root.left.val <= min.intValue()){
                return false;
            }
        }
        if(root.right != null){
            if(max == null){
                if(root.right.val <= root.val) return false;
            }
            else if(root.right.val <= root.val || root.right.val >= max.intValue()){
                return false;
            }
        }
        return subValidBST(root.left, root.val, min) && subValidBST(root.right, max, root.val);
    }

    public static void main(String args[]){
        Integer[] nums = {Integer.MIN_VALUE, null, Integer.MAX_VALUE};
        TreeNode tn = new TreeNode();
        tn = tn.createTreeNode(nums);
        Validate_binary_search_tree s = new Validate_binary_search_tree();
        System.out.println(s.isValidBST(tn));

    }
}
