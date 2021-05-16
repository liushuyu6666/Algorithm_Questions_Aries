package ZZTrashBin;

public class Populating_next_right_pointers_in_each_node {
    public Node connect(Node root){
        Node curr = root;
        Node firstAtLevel = root;
        if(curr == null) return curr;
        curr.next = null;
        // loop in the depth
        while(firstAtLevel.left != null){
            // loop on the same level
            while(curr != null){
                curr.left.next = curr.right;
                if(curr.next != null) curr.right.next = curr.next.left;
                curr = curr.next;
            }
            firstAtLevel = firstAtLevel.left;
            curr = firstAtLevel;
        }
        return root;
    }
}
