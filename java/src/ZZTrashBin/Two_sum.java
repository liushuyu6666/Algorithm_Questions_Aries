package ZZTrashBin;

import java.util.LinkedHashMap;
import java.util.Map;

public class Two_sum {
    public int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for(int i = 0; i < nums.length; i++) map.put(nums[i], i);
        int index;

        for(int i = 0; i < nums.length; i++){
            index = map.getOrDefault(target - nums[i], -1);
            if(index != -1 && index != i) return new int[] {i, index};
        }

        return null;
    }

    public static void main(String args[]){
        int[] nums = {3, 2, 4};
        int target = 6;

        Two_sum s = new Two_sum();
        for(int x:s.twoSum(nums, target)) System.out.println(x);
    }
}
