import java.lang.Math;
class q1{
    public static int predict(int[]prices){
        int left = 0;
        int right = 1;
        int n = prices.length;
        int maxP = 0;
        while(right<n){
            if(prices[left]<prices[right]){
                int profit = prices[right] - prices[left];
                maxP = Math.max(maxP,profit);
            }
            else{
                left = right;
            }
            right++;
        }
        return maxP;

    }
    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,4};
        System.out.println(predict(prices));
        
    }
}