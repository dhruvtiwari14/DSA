class Solution {
    public String removeKdigits(String num, int k) {
        int n=num.length();
        Stack<Character> st = new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && k>0 && st.peek()-'0'> num.charAt(i)-'0'){
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
        }
        while(k>0){
            st.pop();
            k--;
        }
        if(st.isEmpty()) return "0";

        String res="";
        while(!st.isEmpty()){
            res=st.pop()+res;
        }

        //remove zeros
        int i=0;
        while(i<res.length()-1&& (res.charAt(i) == '0')) i++;
        res=res.substring(i);

        if(res.length()==0) return "0";
        return res;
    }
}