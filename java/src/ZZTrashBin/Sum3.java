package ZZTrashBin;

import java.util.*;

public class Sum3 {
    public List<List<Integer>> threeSum(int[] nums){
        if(nums.length < 3){
            return new ArrayList<>();
        }
        Set<List<Integer>> outer = new HashSet<>();
        Arrays.sort(nums);

        int a = 0, b, c;
        while(a < nums.length - 2){
            b = a + 1;
            c = nums.length - 1;
            while(b < c){
                int sum = nums[a] + nums[b] + nums[c];
                if(sum == 0) {
                    outer.add(Arrays.asList(nums[a], nums[b], nums[c]));
                    b++;
                    c--;
                }
                else if(sum > 0) c--;
                else b++;
            }
            a++;
        }
        return new ArrayList<>(outer);
    }

    public static void main (String args[]){
        Sum3 s = new Sum3();
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> ans = s.threeSum(nums);
    }
}
