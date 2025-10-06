class Solution {
    public int minRemoval(int intervals[][]) 
    {
        int cnt = 0;
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        
        int end = intervals[0][1];
        
        for(int i=1;i<intervals.length;i++)
        {
            //current starting point is less than previous interval Ending ie.. Overlap
            if(intervals[i][0]<end)
            {
                cnt++;
                end = Math.min(end,intervals[i][1]);
            }
            else
            {
                end = intervals[i][1];
            }
            
            
        }
        
        return cnt;
        
        
        
    }
}
