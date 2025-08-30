public class q5 {
    public static int MaxProductArray(int[] arr){
        int currmin = 1;
        int currmax = 1;
        int res = arr[0];
        for(int n:arr){
            res = Math.max(res,n);
        }
        for(int n:arr){
            if(n==0){
                currmin = 1;
                currmax = 1;
                continue;
            }
            int temp = currmax*n;
            currmax = Math.max(Math.max(currmax*n,currmin*n),n);
            currmin = Math.min(Math.min(temp,currmin*n),n);
            res = Math.max(res,currmax);
        }
        return res;
    }
    public static void main(String[] args) {
        int [] arr = {2,3,-2,4};
        System.out.println(MaxProductArray(arr));
    }
    
}
