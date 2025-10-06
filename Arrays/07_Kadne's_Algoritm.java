class Solution {
    int maxSubarraySum(int[] arr) 
    {
 
        int maxEnding = arr[0];
        int sum = arr[0];
        
        for(int i=1;i<arr.length;i++)
        {
            maxEnding = Math.max(maxEnding+arr[i],arr[i]);
            
            sum= Math.max(maxEnding,sum);
            
            
            
        }
        
        return sum;
        
        
    }
}
