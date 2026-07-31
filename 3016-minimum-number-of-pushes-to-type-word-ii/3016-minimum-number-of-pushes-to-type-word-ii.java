class Solution {
    public int minimumPushes(String word) {
        int len = word.length();
        if(len<=8) return len;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<len;i++){
            map.put(word.charAt(i),map.getOrDefault(word.charAt(i),0)+1);
        }
        List<Integer> list = new ArrayList<>(map.values());
        list.sort(Collections.reverseOrder());
        int ans=0;

       for (int i = 0; i < list.size(); i++) {
            int pushes = (i / 8) + 1;
            ans += list.get(i) * pushes;
        }
        return ans;

    }
}