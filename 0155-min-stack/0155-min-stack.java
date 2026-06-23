import java.util.*;

class MinStack {

    Stack<Long> st;//to handle test case
    long min;

    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {
        if (st.isEmpty()) {
            st.push((long) val);
            min = val;
        } else {
            if (val > min) {
                st.push((long) val);
            } else {
                st.push(2L * val - min); //new min
                min = val;
            }
        }
    }
    
    public void pop() {
        long x = st.pop();
        if (x < min) {//chnaged value at top
            min = 2 * min - x;
        }
    }
    
    public int top() {
        long x = st.peek();
        if (x > min) return (int) x;
        return (int) min;
    }
    
    public int getMin() {
        return (int) min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */