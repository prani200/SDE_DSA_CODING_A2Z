
class Solution {
    public void reverseArray(int arr[]) 
    {
        int first = 0;
        int last = (arr.length)-1;
        while(first<last)
        {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
    }
 static void reverseArray(int[] arr) {
        int n = arr.length;
        
        // Iterate over the first half 
        // and for every index i, swap
        // arr[i] with arr[n - i - 1]
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }
  
}


  
