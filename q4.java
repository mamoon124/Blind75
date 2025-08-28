public class q4 {
    //Worst Time Complexity: O(n^3)
   /* public static int MaxSubArraySum(int[] arr){
        int sum = 0;
        int Maxsum = 0;
        for(int i =0;i<arr.length-1;i++){
            for(int j =i;j<arr.length-1;j++){
                for(int k = i;k<j;k++){
                    sum=arr[i]+arr[j];
                    Maxsum = Math.max(Maxsum,sum);
                }
            }
        }
        return Maxsum;
    }*/ 
    //A little better TC: O(n^2):
    /*public static int MaxSubArraySum(int[]arr){
        int Maxsum = Integer.MIN_VALUE;
        for(int i =0;i<arr.length-1;i++){
            int sum = 0;
            for(int j =i;j<arr.length-1;j++){
                sum+=arr[j];
                Maxsum = Math.max(Maxsum,sum);

            }
        }
        return Maxsum;
    }*/
    //Best Time complexity: O(n)
    public static int MaxSubArraySum(int [] arr){
        int Maxsum = arr[0];
        int currSum = 0;
        for(int num: arr){
            if(currSum<0){
                currSum = 0;
            }
            currSum+=num;
            Maxsum = Math.max(Maxsum, currSum);
        }
        return Maxsum;
    }
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(MaxSubArraySum(arr));
    }
    
}
