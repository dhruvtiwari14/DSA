class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
           int ele=nums[i];
           arr[i]=ele*ele;
        }
        Arrays.sort(arr);
        return arr;
    }
}