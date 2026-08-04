class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n=nums.length;
        int max=nums[0],min=nums[0];
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
        }
        ArrayList<Integer> list = new ArrayList<>();
          for(int x : nums){
             list.add(x);
        }
        List<Integer> ans = new ArrayList<>();
        for(int i=min;i<=max;i++){
            if(list.contains(i)) continue;
            else ans.add(i);
        }
        return ans;
        
    }
}