class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n=nums.length;
        Stack<Integer> odd = new Stack<>();
        Stack<Integer> even = new Stack<>();
        for(int i=0;i<n;i++){
            if(nums[i]%2==0) even.push(nums[i]);
            else odd.push(nums[i]);
        }
        for(int i=0;i<n;i++){
            if(i%2==0) nums[i]=even.pop();
            else nums[i]=odd.pop();
        }
        return nums;
    }
}