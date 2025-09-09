class q16{
    public static int ListofConsecutiveSubsequence(int[] nums){
        int n = nums.length;
        int[] list = new int[n];
        for(int i =0;i<n;i++){
            list[i] = 1;
        }
// ulta loop chalaynge elements se taaki last element ko uske agle wale se check kr-kr ke dekh skein consecutive horhien ya nhi subsequence
        for(int i = n-1;i>=0;i--){
            for(int j = i+1;j<n;j++){
                if(nums[i]<nums[j]){
                    list[i] = Math.max(list[i],1+list[j]);
                }
            }
        }
        int maxL = 0;
        for(int num:list){
            maxL = Math.max(maxL,num);
        }
        return maxL;

    }
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,2,3};
        System.out.println(ListofConsecutiveSubsequence(nums));
    }
}