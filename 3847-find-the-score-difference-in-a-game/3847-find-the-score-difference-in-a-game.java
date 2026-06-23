class Solution {
    public int scoreDifference(int[] nums) {
        int n = nums.length;
        int p1=0,p2=0;
        int active=1;
        for(int i=0;i<n;i++){
            
           if(nums[i]%2==1){
               if(active==1) active=2;
               else if(active==2) active=1;
           } 
            if((i+1)%6==0){
                if(active==1) active=2;
               else if(active==2) active=1;
            }
            if(active==1){
                p1+=nums[i];
            }
            else p2+=nums[i];
        }
        return p1-p2;
    }
}