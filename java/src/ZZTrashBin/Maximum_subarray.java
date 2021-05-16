package ZZTrashBin;

public class Maximum_subarray {
    public int maxSubArray(int[] nums){
        if(nums.length < 2) return nums[0];
        int[] ans = new int[nums.length];
        ans[0] = nums[0];
        int max = ans[0];

        for(int i = 1; i < nums.length; i++){
            ans[i] = Math.max(nums[i], nums[i] + ans[i-1]);
            if(ans[i] > max) max = ans[i];
        }
        return max;
    }
    public static void main(String args[]){
        Maximum_subarray s = new Maximum_subarray();
        System.out.println(s.maxSubArray(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}
