// User function Template for Java
class Solution {
    public static int[] productExceptSelf(int arr[]) 
    { 
        //Calculate Prefix sum till the previous Element
        
        int n = arr.length;
        int[] prefProduct = new int[n];
        int[] sufProduct = new int[n];
        int[] res = new int[n];
        
        // construct prefix product
        prefProduct[0] = 1;
        
        for(int i=1;i<n;i++)
        {
            prefProduct[i] = arr[i-1]*prefProduct[i-1];
            
        }
        
        //construct suffix product
        sufProduct[n-1] = 1;
        
        for(int i=n-2;i>=0;i--)
        {
            sufProduct[i] = arr[i+1]*sufProduct[i+1];
        }
        
        for(int i=0;i<n;i++)
        {
            res[i] = prefProduct[i]*sufProduct[i];
        }
        
        return res;
        
        
        
        
        
    }
}
