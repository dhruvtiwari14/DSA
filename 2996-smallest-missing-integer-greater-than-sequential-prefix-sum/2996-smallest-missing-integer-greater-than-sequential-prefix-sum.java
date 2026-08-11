class Solution {
    public int missingInteger(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<n;i++){
               list.add(nums[i]);
            }
        int sum=nums[0];
        list.add(nums[0]);
        int max=0;
        
        for(int i=1;i<n;i++){
             if(nums[i]==nums[i-1]+1){
                sum+=nums[i];
             }
             else{
                max=Math.max(max,sum);
                break;
             }
            // list.add(nums[i]);
        }
        max=Math.max(max,sum);

        while(list.contains(max)){
            max++;
        }
        return max;
    }
}