class MinStack {
    private Stack<Integer> s;
    private Stack<Integer> m;
    public MinStack() {
        s=new Stack <>();
        m=new Stack <>();
        int max = Integer.MAX_VALUE;
        m.push(max);
    }
    
    public void push(int val) {
        s.push(val);
        if(val<=m.peek()){
            m.push(val);
        }
    }
    
    public void pop() {
        int r=s.pop();
        if(r==m.peek()){
            m.pop();
        }
    }
    
    public int top() {
        int l=s.peek();
        return l;
    }
    
    public int getMin() {
        return m.peek();
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