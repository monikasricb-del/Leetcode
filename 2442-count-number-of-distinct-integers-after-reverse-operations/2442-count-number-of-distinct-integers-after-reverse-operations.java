class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int val:nums)
        {
            set.add(val);
            set.add(rev(val));
        }
        return set.size();

    }
    public int rev(int n)
    {
        int rev=0;
        while(n>0)
        {
            int rem=n%10;
            rev = rev*10+rem;
            n/=10;
        }
        return rev;
    }
}