class Solution {
    public int minimumPushes(String word) {
        int len=word.length();
        if(len<=8) return len;
        if(len<=16) return 8+((len-8)*2);
        if(len<=24){
            int rem=len-8-8;
            return 8+(8*2)+(rem*3);
        }
        if(len>24){
            int remm=len-24;
            return 8+(8*2)+(8*3)+(remm*4);
        }
        return -1;
    }
}