class Solution {
    public int getSecondLargest(int[] arr) 
    {
        // Code Here
        int n = arr.length;
        if(n<2) return -1;
        int first = -1;
        int second = -1;
        
        for(int i=0;i<n;i++)
        {
            
            if(arr[i]>first)
            {
                 second = first;
                 first = arr[i];
            }
            else{
                
                if(arr[i]>second && arr[i]<first)
                {
                    second =arr[i];
                }
                
            }
            
            
            
            
        }
        
        
        return second;
        
        
        
    }
}
