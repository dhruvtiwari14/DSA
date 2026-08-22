class Solution {
    public boolean checkDivisibility(int n) {
        int sum=digsum(n);
        int prod=prod(n);
        int div=sum+prod;
        if(n%div==0) return true;
        else return false;
    }
    int digsum(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            n=n/10;
        }
        return sum;
    }
    int prod(int n){
        int pro=1;
        while(n>0){
            int rem=n%10;
            pro*=rem;
            n=n/10;
        }
        return pro;
    }
}