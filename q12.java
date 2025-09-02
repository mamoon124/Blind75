import java.util.Arrays;

public class q12 {
    public static int[] CountingBits(int n){
        int[] ans = new int[n+1];
        ans[0] = 0;
        for(int i =1;i<=n;i++){
            ans[i] = ans[i>>1] + (i & 1);

        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 2;
        System.out.println(Arrays.toString(CountingBits(n)));
    }
    
}
