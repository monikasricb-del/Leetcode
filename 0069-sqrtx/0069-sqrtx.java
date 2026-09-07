class Solution {
    public int mySqrt(int x) {
        int low=0,high=x,ans = 0;
        while(low <= high)
        {
           long mid = (low+ high)/2;
           long mids = mid * mid;

           if(mids == x)
           {
             return (int)mid;
           }
           else if(mids > x)
           {
            high = (int)mid - 1;
           }
           else 
           {
            ans = (int)mid;
            low = (int)mid + 1;
           }
        }
        return ans;
    }
}