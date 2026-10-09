class Solution {
    public String removeOuterParentheses(String s) {
        int open=0;
        String res="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                if(open>0) res+=s.charAt(i);
                open++;
            }else{
                open--;
                if(open>0) res+=s.charAt(i);
            }
        }
        return res;
    }
}