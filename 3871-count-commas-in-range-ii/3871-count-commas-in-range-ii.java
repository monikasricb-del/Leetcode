class Solution {
    public long countCommas(long n) {
        long count = 0;
        if(n < 1000){
            return count;
        }
        
        for(long p=1000;p<=n;p*=1000){
            count += n-p+1;
        }
        return count;
    }
}