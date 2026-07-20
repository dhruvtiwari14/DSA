class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> line = new ArrayList<>();
        int row=grid.length;
        int col=grid[0].length;
        int z=0;
        int[] arr = new int[row*col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[z++]=grid[i][j];
            }
        }
        int[] ans = rotate(arr,k);
        for(int i=0;i<ans.length;i++){
            if(i!=0 && i%col==0){
                result.add(line);
                line=new ArrayList<>();
            }
            line.add(ans[i]);
        }
        result.add(line);
        return result;

    }
    public int[] rotate(int[] nums, int k) {
        int n=nums.length;
       k=k%n;
       int temp[] = new int[k];
       for(int i=0;i<k;i++){
          temp[i]=nums[n-k+i];
       }
       for(int i=n-k-1;i>=0;i--){
        nums[i+k]=nums[i];
       }
       for(int i=0;i<k;i++){
        nums[i]=temp[i];
       }
       return nums;
    }
}

