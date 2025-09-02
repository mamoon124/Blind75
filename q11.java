public class q11 {
    public static int NumberofOneBits(int n){
        int res = 0;
        while(n!=0){
            res += n%2;
            n = n>>1;
            
        }
        return res;
    }
    public static void main(String[] args) {
        int n = 11;
        System.out.println(NumberofOneBits(n));
    }
}
