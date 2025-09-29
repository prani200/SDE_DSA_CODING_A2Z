class Solution {
    public int maxScore(int[] cardPoints, int k) 
    {
        int lsum = 0;
        int rsum = 0;

        for(int i=0;i<k;i++)
        {
           lsum+=cardPoints[i];
        }

        int ans = lsum;
        int j = cardPoints.length-1;
       // int ans =0;

        for(int i=k-1;i>=0;i--)
        {
            lsum-=cardPoints[i];
            rsum+=cardPoints[j];
            int sum=lsum+rsum;
            j--;
            ans = Math.max(ans,sum);
        }

     return ans;

        
    }
}

/* Calculate the sum of the first few elements from the start of the array, equal to the total number of cards to be selected.
Store this sum as the initial maximum possible score.
Iterate from the end of this initial window, gradually removing one element from the end of the current front window and adding one new element from the back of the array.
This maintains the total number of selected cards but shifts the balance between front and back.
After each shift, compare the new total score with the previously stored maximum and update the maximum if the new score is higher.
Repeat this process for as many shifts as there are cards to be picked.
Return the highest score obtained after evaluating all possible combinations of selections from the front and back. */














