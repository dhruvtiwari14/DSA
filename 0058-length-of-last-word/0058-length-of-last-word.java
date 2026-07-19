class Solution {
    public int lengthOfLastWord(String s) {
        int l=s.length();
        if(l<=1) return l;
        int c=0;
        for(int i=l-1;i>=0;i--){
            if(s.charAt(i)!=' ') c++;
            else if(c!=0 && s.charAt(i)==' ') break;
        }
        return c;
    }
}