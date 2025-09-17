import java.util.*;
public class q22 {
    private static String getfrq(String s){
        int[] frq = new int[26];
        for(char c: s.toCharArray()){
            frq[c - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        char c = 'a';
        for(int i:frq){
            sb.append(c);
            sb.append(i);
            c++;

        }
        return sb.toString();
    }
    public static List<List<String>> GroupAnagrams(String[] str){
        if(str == null || str.length == 0){
            return new ArrayList<>();
        }
        Map<String,List<String>> frequencyString = new HashMap<>();
        for(String s: str){
            String frequency = getfrq(s);
            if(frequencyString.containsKey(frequency)){
                frequencyString.get(frequency).add(s);
            }
            else{
                List<String> strlist = new ArrayList<>();
                strlist.add(s);
                frequencyString.put(frequency,strlist);
            }
        }
        return new ArrayList<>(frequencyString.values());

    }
    public static void main(String[] args) {
        String[] str = {"ate","tea","bat","tab","nat","eat"};
        System.out.println(GroupAnagrams(str));
    }
    
}
