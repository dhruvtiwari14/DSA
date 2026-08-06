class Solution {
    public int smallestNumber(int n, int t){
        while(n<=100){
            if(digprod(n)%t==0) return n;
            n=n+1;
        }
        return n;
    }
    
    int digprod(int n){
        int prod=1;
        while(n>0){
            int rem=n%10;
            prod*=rem;
            n=n/10;
        }
        return prod;
    }
}