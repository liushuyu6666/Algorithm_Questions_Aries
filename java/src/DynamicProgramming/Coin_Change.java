package DynamicProgramming;

import java.util.Arrays;

public class Coin_Change {
    public int coinChange(int[] coins, int amount) {
        if(amount == 0) return 0;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, -1);
        for(int coin : coins){
            if(coin > amount) continue;
            dp[coin] = 1;
            for(int i = coin + 1; i <= amount; i++){
                if(dp[i - coin] != -1){
                    if(dp[i] == -1){
                        dp[i] = dp[i - coin] + 1;
                    }
                    else{
                        dp[i] = Math.min(dp[i - coin] + 1, dp[i]);
                    }
                }
            }
        }
        return dp[amount];
    }
}
