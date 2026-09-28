class Solution {
    public int maxDepth(String s) {
       int left=0;
       int right=0,ans=0;
       for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                left++;
            }
            if(s.charAt(i) == ')'){
                right++;
            }
            ans = Math.max(ans, Math.abs(left - right));
       } 
       return ans;
    }
}