class q14{
    public static int ReverseBits(int n){
        int res = 0;
        for(int i =0;i<32;i++){
            int lsb = n & 1;
            int reverselsb = lsb >> (31-i);
            res = res | reverselsb;
            n = n >> 1;
        }
        return res;
    }
    public static void main(String[] args) {
        int n = 1001;
        System.out.println(ReverseBits(n));
    }
}