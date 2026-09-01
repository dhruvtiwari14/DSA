class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        int max=0;
        String ans="";
        for(int i=0;i<n;i++){
            //odd len plain
            int p1=i,p2=i;
            while(p1>=0 && p2<n && s.charAt(p1)==s.charAt(p2)){
                p1--;
                p2++;
            }
            if(p2-p1-1>max){//bcoz p1,p2 are outside palin range
                max=p2-p1-1;
                ans=s.substring(p1+1,p2);//p2 not included
            }

            //even length palin
             p1=i;p2=i+1;
            while(p1>=0 && p2<n && s.charAt(p1)==s.charAt(p2)){
               p1--;
               p2++;
            }
            if(p2-p1-1>max){//bcoz p1,p2 are outside palin range
                max=p2-p1-1;
                ans=s.substring(p1+1,p2);//p2 not included
            }

        }
        return ans;
    }
    
}