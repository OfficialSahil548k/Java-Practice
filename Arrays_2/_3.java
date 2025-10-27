package Arrays_2;

public class _3 {
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        int buy_price = Integer.MAX_VALUE;
        int max_profit = 0;
        for(int i=0; i<prices.length; i++){
            if(prices[i] <= buy_price){
                buy_price = prices[i];
            } else{
                int profit = prices[i] - buy_price;
                if(profit > max_profit){
                    max_profit = profit;
                }
            }
        }
        System.out.println("Maximum Profit: " + max_profit);
    }
}
