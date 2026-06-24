class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length;
        Arrays.sort(nums);
        int min=Integer.MAX_VALUE;
        int ans=0;
        for(int i=0;i<n;i++){
            int j=i+1,k=n-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum<target){
                   int diff=Math.abs(sum-target);
                   if(diff<min){
                    min=diff;
                    ans=sum;
                   }
                   j++;
                }
                else if(sum>=target){
                    int diff=Math.abs(sum-target);
                    if(diff<min){
                        min=diff;
                        ans=sum;
                    }
                   k--;
                }
            }
        }
        return ans;
    }
}