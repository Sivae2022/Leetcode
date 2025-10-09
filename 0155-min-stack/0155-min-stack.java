import java.util.Stack;

class Pair {
    int x, y;

    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class MinStack {
    Stack<Pair> st;

    public MinStack() {
        st = new Stack<>();
    }

    public void push(int val) {
        if (st.isEmpty()) {
            st.push(new Pair(val, val)); // First element, min = val
        } else {
            int currentMin = st.peek().y;
            st.push(new Pair(val, Math.min(val, currentMin)));
        }
    }

    public void pop() {
        st.pop();
    }

    public int top() {
        return st.peek().x;
    }

    public int getMin() {
        return st.peek().y;
    }
}

/**
 * Example usage:
 * MinStack obj = new MinStack();
 * obj.push(-2);
 * obj.push(0);
 * obj.push(-3);
 * System.out.println(obj.getMin()); // -3
 * obj.pop();
 * System.out.println(obj.top());    // 0
 * System.out.println(obj.getMin()); // -2
 */
