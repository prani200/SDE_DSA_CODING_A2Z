// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) 
    {
       int n = arr.length;
       
       //HashMap store remaining sum
       HashMap<Double,Integer> map = new HashMap<>();
       double sum = 0;
       int maxLen = 0;
       
       for(int i=0;i<n;i++)
       {
           //calculate the prefix sum till index i:
           sum+=arr[i];
           
           // if the sum = k, update the maxLen:
           if(sum==k)
           {
               maxLen = Math.max(maxLen,i+1);
           }
           
           // calculate the sum of remaining part i.e. x-k:
           double rem = sum-k;
           
          //Calculate the length and update maxLen:
          if(map.containsKey(rem))
          {
              int len = i-map.get(rem);
              maxLen = Math.max(maxLen,len);
          }
          
         //Finally, update the map checking the conditions:
         if(!map.containsKey(sum))
         {
             map.put(sum,i);
         }
        
   
           
       }
       
       return maxLen;
    
       
    }
}
