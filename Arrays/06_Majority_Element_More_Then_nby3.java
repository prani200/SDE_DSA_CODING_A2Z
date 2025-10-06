class Solution {
    public ArrayList<Integer> findMajority(int[] arr) 
    {
        int n = arr.length;
        
        //initialise the candiates & their counts
        int e1 = -1;
        int e2 = -1;
        int c1 = 0;
        int c2 = 0;
        
        for(int num:arr)
        {
            //Increment count for candiadate 1
            if(num==e1)
            {
                c1++;
            }
            else if(num==e2)
            {
                c2++; //Increment count for candiadate 2
            }
            else if(c1==0)
            {
                e1 = num;
                c1++;
            }
            else if(c2==0)
            {
                e2 = num;
                c2++;
            }
            else{
                c1--;
                c2--;
            }
   
        }
        
        //check
        int ct1=0;
        int ct2=0;
        for(int el:arr)
        {
            if(el==e1){
                ct1++;
            }
            
            if(e2==el)
            {
                ct2++;
            }
        }
        
        ArrayList<Integer> res = new ArrayList<>();
        
        if(ct1>n/3) {
            res.add(e1);
        }
        
        if(ct2>n/3 && e1!=e2) res.add(e2);
        
        if(res.size()==2 && res.get(0)>res.get(1))
        {
            int temp = res.get(0);
            res.set(0,res.get(1));
            res.set(1,temp);
        }
        
        return res;   
        
    }
}
