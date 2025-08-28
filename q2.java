import java.util.*;
public class q2 {
    //Time Complexity: O(n^2),Space Complexity: O(1)
/*   public static int Duplicate(int[] arr){
        for(int i =0;i<arr.length;i++){
           for(int j = 1;j<arr.length;j++){
            if(arr[i] == arr[j]){
                return arr[i];
            }
           }
        }
        return -1;

    }*/
    //Time Complexity: O(n),Space Complexity: O(n)
    public static boolean Duplicate2(int[]arr){
        HashSet<Integer> hs = new HashSet<>(); 
        for(int num: arr){
            if(hs.contains(num)){
                return true;
            }
            hs.add(num);
        }
        return false;
       
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1};
        System.out.println(Duplicate2(arr));
    }
    
}
