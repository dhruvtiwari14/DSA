class Solution {
    public int[][] generateMatrix(int n) {
        int top=0,bottom=n-1,left=0,right=n-1;
        int num=1;
        int[][] arr = new int[n][n];
        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
               arr[top][i]=num;
               num++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                arr[i][right]=num;
                num++;
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    arr[bottom][i]=num;
                    num++;
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    arr[i][left]=num;
                    num++;
                }
                left++;
            }

        }
        return arr;
    }
}