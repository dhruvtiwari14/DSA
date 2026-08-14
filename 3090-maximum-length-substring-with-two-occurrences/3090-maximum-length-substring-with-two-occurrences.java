class Solution {
    public int maximumLengthSubstring(String s) {
        int len=s.length();
        Map<Character,Integer> map = new HashMap<>();
        int l=0,r=0;
        int max=0;
        while(r<len){
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
            while(map.get(s.charAt(r))>2){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                if(map.get(s.charAt(l))==0) map.remove(s.charAt(l));
                l++;
            }
            max=Math.max(max,r-l+1);
            r++;   
            }
            return max;
    }
}