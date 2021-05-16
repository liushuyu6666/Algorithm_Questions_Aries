package ZZTrashBin;

public class Best_time_to_buy_and_sell_stock_II {
    public int maxProfit(int[] prices){
        if(prices.length < 2) return 0;
        int sum = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] > prices[i-1]){
                sum += prices[i] - prices[i-1];
            }
        }
        return sum;
    }

    public static void main(String args[]){
        int nums1[] = {7, 1, 5, 3, 6, 4};
        int nums2[] = {1, 2, 3, 4, 5};
        int nums3[] = {7, 6, 4, 3, 1};

        Best_time_to_buy_and_sell_stock_II s = new Best_time_to_buy_and_sell_stock_II();

        System.out.println(s.maxProfit(nums1));
        System.out.println(s.maxProfit(nums2));
        System.out.println(s.maxProfit(nums3));
    }
}
