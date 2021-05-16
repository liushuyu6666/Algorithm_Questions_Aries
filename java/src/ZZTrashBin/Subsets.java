package ZZTrashBin;

import java.util.*;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        List<Integer> l = new ArrayList<>();
        List<List<Integer>> lans = new ArrayList();
        ans.add(l);
        for(int n : nums){
            ans = union(n, ans);
        }
        for(List<Integer> ll : ans){
            lans.add(ll);
        }
        return lans;
    }
    public Set<List<Integer>> union(int num, Set<List<Integer>> box){
        Set<List<Integer>> ans = new HashSet<>(box);
        if(box.size() == 0){
            List<Integer> temp = new ArrayList<>();
            temp.add(num);
            ans.add(temp);
            return ans;
        }
        for(List<Integer> b : box){
            List<Integer> newElem = new ArrayList<>(b);
            newElem.add(num);
            Collections.sort(newElem);
            ans.add(newElem);
        }
        return ans;

    }
}
