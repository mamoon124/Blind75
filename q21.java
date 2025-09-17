class q21{
    public static int[][] InsertIntervals(int[][] intervals,int[] newIntervals){
        int[][] res = new int[intervals.length+1][2];
        int i =0;
        int j =0;
        //Har interval ko add kro jo new wale se pehele end hojarha
        while(i<intervals.length && intervals[i][1]<newIntervals[0]){
            res[j++] = intervals[i++];
        }
        //Merge krdo overlap jp krrhein hain unko
        while(i<intervals.length && intervals[i][0]<=newIntervals[1]){
            newIntervals[0] = Math.min(newIntervals[0],intervals[i][0]);
            newIntervals[1] = Math.max(newIntervals[1],intervals[i++][1]);

        }
        res[j++] = newIntervals;
        //finally end me remaining intervals ko add krdo
        while (i<intervals.length) {
            res[j++] = intervals[i++];
            
        }
        return java.util.Arrays.copyOf(res, j);
    }
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{6,8}};
        int[] newIntervals = {2,5};
        System.out.println(java.util.Arrays.deepToString(InsertIntervals(intervals,newIntervals)));
    }
}