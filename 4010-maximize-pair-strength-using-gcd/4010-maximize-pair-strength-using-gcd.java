class Solution {
    public long maxPairStrength(int[] nums) {
        long max=0;
        long n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j) continue;
                long ans=((long)nums[i]*nums[j])/(long)(Math.pow((long)gcd(nums[i],nums[j]),2));
                max=Math.max(max,ans);
            }
        }
        return max;
    }
    long gcd(long a,long b){
        while(b!=0){
            long temp= b;
            b=a%b;
            a=temp;
       }
       return a;
    }
}