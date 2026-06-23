class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n =nums.length;
        List<Integer> list = new ArrayList<>();
        int c1=0,c2=0;
        int ele1=0,ele2=0;
        for(int i=0;i<n;i++){
            if(c1==0 && nums[i]!=ele2){
                ele1=nums[i];
                c1=1;
            }
            else if(c2==0 && nums[i]!=ele1){
                ele2=nums[i];
                c2=1;
            }
            else if(nums[i]==ele1) c1++;
            else if(nums[i]==ele2) c2++;
            else {
                c1--;
                c2--;
            }
        }
        int a=0,b=0;
        for(int i=0;i<n;i++){
            if(nums[i]==ele1) a++;
            else if(nums[i]==ele2) b++;
        }
            if(a>n/3) list.add(ele1);
            if(b>n/3) list.add(ele2);
            
            return list;
        }
        
    }
