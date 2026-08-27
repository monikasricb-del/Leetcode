class Solution {
    public int gcdOfOddEvenSums(int n) {
        int odd = 4;
        int even = 4;
        int sumOdd = 0,sumEven = 0;
        for(int i=1;i<=2*n;i++)
        {
            if(odd > 0 && i % 2 != 0)
            {
                sumOdd += i;
            }
            else if(even > 0 && i % 2 == 0)
            {
                sumEven += i;
            }
        }
        return GCD(sumOdd,sumEven);
    }

    public static int GCD(int a,int b)
    {
        int max = Math.max(a,b);
        int min = Math.min(a,b);
        while(min > 0)
        {
            int rem = max % min;
            max = min;
            min = rem;
        }

        return max;
    }
}