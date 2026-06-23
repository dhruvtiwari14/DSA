class Solution {
    public boolean findSubarrays(int[] nums) {
        List<Integer> sums = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            int sum=nums[i]+nums[i+1];
            if(sums.contains(sum)) return true;
            sums.add(sum);
        }
        return false;
        }


    }