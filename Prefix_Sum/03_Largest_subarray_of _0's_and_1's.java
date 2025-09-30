class Solution {
    public int maxLen(int[] arr) 
    {
        int n = arr.length;
        if(n==1) return 0;
        int preSum = 0;
        int res = 0;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<n;i++)
        {
            preSum += (arr[i]==0)?-1:1;  // interchange 0's to -1 == Longest Subarray of sum 0
            
            if(preSum == 0)
            {
                res = i+1; // to handle sum = 0  at last Index
            }
            
            if(map.containsKey(preSum)) //if this sum is seen before 
            {
                res = Math.max(res,i-map.get(preSum));
            }
            else
            {
                map.put(preSum,i);
            }
            
            
        }
        
        return res;
        
        
    }
}
