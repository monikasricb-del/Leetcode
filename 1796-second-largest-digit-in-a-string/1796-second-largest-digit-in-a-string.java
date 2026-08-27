class Solution {
    public int secondHighest(String s) {
        int max  = -1;
        int secmax = -1;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch >= '0' && ch <= '9')
            {
                int digit = ch - '0';
                if(digit > max)
                {
                    secmax = max;
                    max = digit;
                }
                else if(digit > secmax && digit < max)
                {
                    secmax = digit;
                }
            }
        }
        return secmax;
    }
}