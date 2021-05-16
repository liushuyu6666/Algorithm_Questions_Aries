package ZZTrashBin;

import java.util.*;

public class Top_k_frequent_elements {
    public int[] topKFrequent(int[] nums, int k) {
        if(k >= nums.length){
            Set<Integer> set = new HashSet<>();
            for(int i = 0; i < nums.length; i++){
                set.add(nums[i]);
            }
            int[] ans = new int[set.size()];
            int i = 0;
            for(Integer t : set){
                ans[i] = Integer.valueOf(t);
                i++;
            }
            return ans;
        }
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int n : nums){
            Integer curr = new Integer(n);
            Integer count = freq.containsKey(curr) ? freq.get(curr) : 0;
            freq.put(curr, count+1);
        }
        // sort
        List<Integer> values = new ArrayList(freq.values());
        Collections.sort(values);
        Collections.reverse(values);
        int[] ans = new int[k];
        int i = 0;
        if(k >= values.size()){
            for(Map.Entry<Integer, Integer> entry: freq.entrySet()){
                ans[i] = entry.getKey();
                i++;
            }
            return ans;
        }
        int threshold = values.get(k);
        for(Map.Entry<Integer, Integer> entry: freq.entrySet()){
            if(entry.getValue() > threshold){
                ans[i] = entry.getKey();
                i++;
            }
        }
        return ans;
    }
}
