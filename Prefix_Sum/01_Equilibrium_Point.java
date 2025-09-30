class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) 
    {
        int n = arr.length;
        if(n<3) return -1;
        int[] preSum = new int[n];
        int[] sufSum = new int[n];
        
        //construct prefSum
        preSum[0] = arr[0];
        for(int i=1;i<n;i++)
        {
            preSum[i] = preSum[i-1]+arr[i];
        }
        
        //construct sufSum
        sufSum[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            sufSum[i]=sufSum[i+1]+arr[i];
        }
        
        for(int i=0;i<n;i++)
        {
            if(preSum[i] == sufSum[i])
            {
                return i;
            }
        }
        
        return -1;
        
        
         
        
    }
}
