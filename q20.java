public class q20 {
    private static int robhelp(int[] nums){
        int n = nums.length;
        if(n==0) return 0;
        if(n == 1) return nums[0];
        int[] dp = new int[n+1];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for(int i =2;i<n;i++){
            dp[i] = Math.max(dp[i-2]+nums[i],dp[i-1]);
        }
        return dp[n-1];
    }
    public static int HouseRobber2(int[] nums){
        int n = nums.length;
        if(n<2){
            return nums[0];
        }
        int[] skipFirst = new int[n-1];
        int[] skipLast = new int[n-1];
        for(int i =0;i<n-1;i++){
            skipFirst[i] = nums[i+1];
            skipLast[i] = nums[i];
        }
        int skipLastloot = robhelp(skipLast);
        int skipFirstloot = robhelp(skipFirst);

        return Math.max(skipFirstloot,skipLastloot);

    }
    public static void main(String[] args) {
        int[] nums = {2,3,2};
        System.out.println(HouseRobber2(nums));
    }
    
}
