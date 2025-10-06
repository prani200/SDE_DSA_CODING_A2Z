class Solution {
    public int missingNumber(int[] arr)
    {
        Arrays.sort(arr);
        int num = 1;
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>0 && arr[i]==num)
            {
                num++;
            }
            
            
            
        }
        
        return num;
        
        
        
        
        
        
        
    }
}
