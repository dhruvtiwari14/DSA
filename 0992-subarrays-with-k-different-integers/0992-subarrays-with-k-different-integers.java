class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return func(nums,k)-func(nums,k-1);
    }
    public int func(int[] arr,int k){
        int n= arr.length;
        int r=0,l=0,c=0;
        Map<Integer,Integer> map=new HashMap<>();
        while(r<n){
          map.put(arr[r],map.getOrDefault(arr[r],0)+1);

          while(map.size()>k){
            map.put(arr[l],map.get(arr[l])-1);
            if(map.get(arr[l])==0) map.remove(arr[l]);
            l++;
          }
          c+=r-l+1;
          r++;
        }
        return c;
    }
}