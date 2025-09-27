import java.util.*;
class q25{
    public static boolean ValidPallindrome(String s){
        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            if(s.charAt(right)!=s.charAt(left)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(ValidPallindrome(s));
    }

}