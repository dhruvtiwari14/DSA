class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        if(n<=1) return n;
        int max=0;
        Set<Character> set = new HashSet<>();
        int l=0;
        for(int i=0;i<n;i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(i));
            max=Math.max(max,set.size());
        }
        return max;
    }
}