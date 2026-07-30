class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        int[] arr = new int[k];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
         List<Map.Entry<Integer, Integer>> list =  new ArrayList<>(map.entrySet());

        list.sort(Map.Entry.<Integer, Integer>comparingByValue().reversed());
        int z=0;
        while(k!=0){
            arr[z]=list.get(z).getKey();
            k--;
            z++;
        }
        return arr;
    }
}