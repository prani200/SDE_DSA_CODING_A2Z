class Solution {
    int maxProduct(int[] arr) 
    {
        int pre = 1 ,suf = 1;
        int maxprod = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            
            if(pre==0) pre=1;
            if(suf==0) suf=1;
            
            pre*=arr[i];
            suf*=arr[(arr.length)-i-1];
            
            maxprod =Math.max(maxprod,Math.max(pre,suf));
        
        }
        
        
        return maxprod;
  
                  
        
    }
}
