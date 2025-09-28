class q26{
    public static int getsum_without_arthemetic(int a,int b){
        while(b!=0){
            int temp = (a&b)<<1;
            a = a ^ b;
            b = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        System.out.println(getsum_without_arthemetic(a,b));
    }
}