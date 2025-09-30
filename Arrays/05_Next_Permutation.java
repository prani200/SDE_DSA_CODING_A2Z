class Solution 
{
    void nextPermutation(int[] arr) 
    {
        int n = arr.length;
        int pivot = -1;
        
        //find the break point 
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]<arr[i+1])
            {
                pivot = i;
                break;
            }
        }
        
        // if no break point exists, then reverse the whole array
        if(pivot == -1)
        {
            reverse(arr,0,n-1);
            return;
        }
        
        // find the element from right which is greater than pviot
        for(int i=n-1;i>pivot;i--)
        {
            if(arr[i]>arr[pivot])
            {
                swap(arr,i,pivot);
                break;
            }
        }
        
        //reverse the elements from pivot+1 to the end
        reverse(arr,pivot+1,n-1);
  
    }
    
    private static void swap(int[] arr,int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    
    private static void reverse(int[] arr, int start, int end)
    {
        while(start<end)
        {
            swap(arr,start++,end--);
        }
    }
}
