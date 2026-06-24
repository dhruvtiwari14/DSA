class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int max=0;
        Stack<Integer> st  = new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && heights[st.peek()]>heights[i]){
                int element=heights[st.peek()];
                st.pop();
                int nse=i;
                int pse=st.isEmpty()?-1:st.peek();
                int area=element*(nse-pse-1);
                max=Math.max(max,area);
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int element=heights[st.peek()];
            st.pop();
            int nse=n;
            int pse=st.isEmpty()?-1:st.peek();
            int area=element*(nse-pse-1);
                max=Math.max(max,area);
        }
        return max;
    }
}