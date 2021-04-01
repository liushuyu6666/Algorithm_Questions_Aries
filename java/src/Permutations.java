import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        List<List<Integer>> lans = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            ans = union(nums[i], ans);
        }
        for(List<Integer> an : ans){
            lans.add(an);
        }
        return lans;
    }
    public Set<List<Integer>> union(Integer num, Set<List<Integer>> box){
        Set<List<Integer>> ans = new HashSet<>();
        if(box.size() == 0){
            List<Integer> temp = new ArrayList<>();
            temp.add(num);
            ans.add(temp);
            return ans;
        }
        for(List<Integer> b : box){
            for(int i = 0; i <= b.size(); i++){
                List<Integer> bx = new ArrayList<>(b);
                bx.add(i, num);
                ans.add(bx);
            }
        }
        return ans;
    }
    public static void main(String args[]){
        Permutations permutations = new Permutations();
        int[] myInput = {1, 2, 3};
        List<List<Integer>> ans = permutations.permute(myInput);
        System.out.println(ans);

    }
}
