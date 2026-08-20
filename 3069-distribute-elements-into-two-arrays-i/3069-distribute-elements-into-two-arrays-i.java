class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        l1.add(nums[0]);
        l2.add(nums[1]);
        int idx=2;
        while(idx<n){
            if(l1.get(l1.size()-1) >= l2.get(l2.size()-1)){
                l1.add(nums[idx]);
            }
            else l2.add(nums[idx]);
            idx++;
        }
        int z=0;
        int[] ans = new int[n];
        for(int i=0;i<l1.size();i++){
            ans[z++]=l1.get(i);
        }
        for(int i=0;i<l2.size();i++){
            ans[z++]=l2.get(i);
        }
        return ans;
    }
}