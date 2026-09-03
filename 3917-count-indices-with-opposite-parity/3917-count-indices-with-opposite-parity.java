class Solution {
    public int[] countOppositeParity(int[] nums) {
        int n=nums.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){//even search for odd
               int c=0;
               for(int j=i+1;j<n;j++){
                if(nums[j]%2==1) c++;
               }
               ans[i]=c;
            }
            else{
                int c=0;
               for(int j=i+1;j<n;j++){
                if(nums[j]%2==0) c++;
               }
               ans[i]=c;
            }
        }
        return ans;
    }
}