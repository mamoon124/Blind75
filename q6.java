class q6{
    public static int MininRotatedSortedArray(int[] nums){
        int left = 0;
        int right = nums.length-1;
        while(left<right){
            int mid = left + (right - left) / 2;
            //check whether middle element is greater than the right element
            
            if(nums[mid]>nums[right]){
                left = mid+1;
            }
            else{
                right = mid;
            }
        }
        return nums[left];
    }
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        System.out.println(MininRotatedSortedArray(nums));
    }
}