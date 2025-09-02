public class q13 {
    public static int MissingNumber(int[] arr){
/*      int res = arr.length;
        for(int i =0;i<arr.length;i++){
            res = res ^ i ^ arr[i];
        }
        return res;
    }
        */
        int res = arr.length;
        for(int i =0;i<arr.length;i++){
            res+=(i-arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr= {0,1,3};
        System.out.println(MissingNumber(arr));
    }
    
}

