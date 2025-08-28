import java.util.*;
public class q3 {
    public static int[] ProdExceptSelf(int[] arr){
        int[] res = new int[arr.length];
        Arrays.fill(res,1);
        int prefix = 1;
        for(int i =0;i<arr.length;i++){
            res[i] = prefix;
            prefix*=arr[i];
        }
        int postfix = 1;
        for(int i = arr.length-1;i>=0;i--){
            res[i]*=postfix;
            postfix*=arr[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        System.out.println(Arrays.toString(ProdExceptSelf(arr)));
        
    }
    
}
