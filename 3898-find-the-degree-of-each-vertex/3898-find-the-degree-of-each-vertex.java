class Solution {
    public int[] findDegrees(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int ans[] = new int[r];
        for(int i=0;i<r;i++)
        {
            int count = 0;
            for(int j=0;j<c;j++)
            {
                ans[i] += matrix[i][j];
            }
        }
        return ans;
    }
}