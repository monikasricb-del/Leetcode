class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        ArrayList<Integer> lst = new ArrayList<>();
        int row=arr.length;
        int col=arr[0].length;

        int top=0,bot=row-1;
        int left=0,right=col-1;
        int total=row*col;
        int count=0;
        while(count<total){
            for(int i=left;i<=right && count<total;i++){
                lst.add(arr[top][i]);
                count++;
            }top++;

            for(int i=top;i<=bot && count<total;i++){
                lst.add(arr[i][right]);
                count++;
            }right--;

            for(int i=right;i>=left && count<total;i--){
                lst.add(arr[bot][i]);
                count++;
            }bot--;

            for(int i=bot;i>=top && count<total;i--){
                lst.add(arr[i][left]);
                count++;
            }left++;
        }
        return lst;
    }
}