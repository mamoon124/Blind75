class q23{
    public static boolean IsSubsequence(String s,String t){
        int s_ptr = 0;
        int t_ptr = 0;
        while(s_ptr<s.length() && t_ptr<t.length()){
            if(s.charAt(s_ptr) == t.charAt(t_ptr)){
                s_ptr++;
            }
            t_ptr++;
        }
        return s_ptr == s.length();
    }
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(IsSubsequence(s, t));
    }
}