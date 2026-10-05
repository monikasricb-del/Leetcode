class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> lst=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        
        for(int num:nums){
            if(set.contains(num)){
                lst.add(num);
            }
            else{
                set.add(num);
            }
        }
        return lst;
    }
}