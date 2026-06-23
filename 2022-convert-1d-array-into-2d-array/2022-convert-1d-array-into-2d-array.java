class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int l=original.length;
        int[][] res = new int[m][n];
        if(l==m*n){
        for(int i=0;i<l;i++){
            int row=i/n;
            int col=i%n;
            if(row<m && col<n)
            res[row][col]=original[i];
        }
        return res;
        }
        return new int[][]{};
    }
}