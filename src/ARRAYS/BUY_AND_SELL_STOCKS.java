package ARRAYS;

public class BUY_AND_SELL_STOCKS {
    public static int  profit(int [] prices) {
        int buystock = prices [0];
        int maxprofit = 0;
        for ( int i = 0 ; i< prices.length; i++){
            if(buystock < prices[i]){
                int profit = prices[i]-buystock;
                maxprofit = Math.max(profit,maxprofit);
            }
            else {
                buystock = prices[i];
            }
        }
        return maxprofit;

    }
    public static void main(String[] args) {
        int [] prices  = { 7,1,5,3,6,4};
        int maxprofit = profit(prices);
        System.out.println(maxprofit);

    }
}
