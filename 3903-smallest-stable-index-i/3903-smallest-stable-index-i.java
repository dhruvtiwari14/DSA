class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int max=0;
        int min=Integer.MAX_VALUE;
        int ins;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            for(int j=i;j<n;j++){
                min=Math.min(min,nums[j]);
            }
            ins=max-min;
            if(ins<=k) return i;
            min=Integer.MAX_VALUE;
        }
        return -1;
    }
}