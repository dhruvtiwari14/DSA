class Solution {
    public int strStr(String haystack, String needle) {
        int h=haystack.length();
        int n=needle.length();
          for(int j=0;j<h;j++){
            if(needle.charAt(0)==haystack.charAt(j)){
                int start=j;
                int s=j;
                int k=0;
               while(s<h && k<n && haystack.charAt(s)==needle.charAt(k)){
                        s++;k++;
                    }
                if(k==n) return start;

                }
            }
            return -1;
          }
        }