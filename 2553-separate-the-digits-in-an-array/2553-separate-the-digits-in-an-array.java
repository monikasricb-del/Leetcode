class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> lst=new ArrayList<>();
        for(int num:nums){
            String s=String.valueOf(num);

            for(char ch:s.toCharArray()){
                lst.add(ch - '0');
            }
        }
        int[] ans=new int[lst.size()];
        int i=0;
        for(int val:lst){
            ans[i++] = val;
        }

        return ans;
    }
}