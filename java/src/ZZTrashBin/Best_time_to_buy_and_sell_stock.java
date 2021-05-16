package ZZTrashBin;

public class Best_time_to_buy_and_sell_stock {
    public int maxProfit(int[] prices){
        if(prices.length < 2) return 0;
        int sum = 0, minPrice = prices[0];
        for(int i = 1; i < prices.length; i++){
            // update the minimum
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }
            else{
                sum = Math.max(sum, prices[i] - minPrice);
            }
        }
        return sum;
    }

    public static void main(String args[]){
        Best_time_to_buy_and_sell_stock s
                = new Best_time_to_buy_and_sell_stock();
        System.out.println(s.maxProfit(new int[] {7, 1, 5, 3, 6, 4}));
    }
}

