class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=first(nums,target);
        int last=last(nums,target);
        return new int[]{first,last};
    }
    public int first(int[] nums,int target){
        int l=0,r=nums.length-1;
        int ans=-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(target == nums[mid]){
                ans=mid;
                r=mid-1;
            }
            else if(target<nums[mid]){
                r=mid-1;
            }
            else{
                 l=mid+1;
            }

        }
        return ans;
}

public int last(int[] nums,int target){
        int l=0,r=nums.length-1;
        int ans=-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(target == nums[mid]){
                ans=mid;
                l=mid+1;
            }
            else if(target<nums[mid]){
                r=mid-1;
            }
            else{
                 l=mid+1;
            }

        }
        return ans;
}
}