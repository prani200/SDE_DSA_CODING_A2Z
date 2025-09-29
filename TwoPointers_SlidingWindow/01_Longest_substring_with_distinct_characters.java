class Solution {
    public int longestUniqueSubstr(String s) 
    {
       HashMap<Character,Integer> map = new HashMap<>();
       int start = 0;
       int n = s.length();
       int maxLen = 0;
       
       for(int end=0;end<n;end++)
       {
           //curenr Character
           char curChar = s.charAt(end);
           //if current charcter already present in map, move start (expand The Window)
           //additional condition to check within the window size
           if(map.containsKey(curChar) && map.get(curChar)>=start)
           {
               start = map.get(curChar)+1;
           }
           map.put(curChar,end);
           maxLen = Math.max(maxLen,end-start+1);
       }
       
       return maxLen;
       
        
    }
}
