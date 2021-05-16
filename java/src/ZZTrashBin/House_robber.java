package ZZTrashBin;

public class House_robber {
    public int rob(int[] nums){
        if(nums.length < 1) return 0;
        if(nums.length < 2) return nums[0];
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = nums[1];
        int maxP = 0, max = dp[0];
        for(int i = 2; i < nums.length; i++){
            max = Math.max(max, dp[i-2]);
            dp[i] = max + nums[i];
        }

        return Math.max(dp[nums.length-1], dp[nums.length-2]);
    }

    public static void main(String args[]){
        House_robber s = new House_robber();
        System.out.println(s.rob(new int[] {2, 1, 1, 2}));
    }
}
