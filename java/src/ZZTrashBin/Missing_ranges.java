package ZZTrashBin;

import java.util.ArrayList;
import java.util.List;

public class Missing_ranges {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> ans = new ArrayList<>();
        String range = null;
        if(nums.length < 1){
            if(lower == upper){
                ans.add(Integer.toString(lower));
                return ans;
            }
            ans.add(Integer.toString(lower) + "->" + Integer.toString(upper));
            return ans;
        }
        int lowerRange = lower;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] - lowerRange > 1){
                range = Integer.toString(lowerRange) + "->" + Integer.toString(nums[i] - 1);
                ans.add(range);
            }
            else if(nums[i] - lowerRange == 1){
                ans.add(Integer.toString(lowerRange));
            }
            lowerRange = nums[i] + 1;
            if(lowerRange > upper) return ans;
        }
        if(upper > lowerRange){
            ans.add(Integer.toString(lowerRange) + "->" + Integer.toString(upper));
        }
        else{
            ans.add(Integer.toString(upper));
        }
        return ans;
    }

    public static void main(String args[]){
        Missing_ranges s = new Missing_ranges();
        int[] nums = {1000000000};
        System.out.println(s.findMissingRanges(nums, 0, 1000000000));
    }
}
