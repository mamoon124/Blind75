import java.util.*;
public class q8 {
    public static int[] Twosum(int[] arr,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<arr.length;i++){
            int complement = target - arr[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};

            }
            map.put(arr[i],i);
        }
        return new int[0];
    }
    public static void main(String[] args) {
        int[] arr = {2,1,5,3};
        int target = 4;
        System.out.println(Arrays.toString(Twosum(arr, target)));
    }
    
}
