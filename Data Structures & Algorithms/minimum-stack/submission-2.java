class MinStack {

    private Stack<Integer> stack;

    private Stack<Integer> minstack;

    public MinStack() {
        stack = new Stack<>();
        minstack= new Stack<>();
        minstack.push(Integer.MAX_VALUE);
    }
    
    public void push(int val) {
        stack.push(val);
        if(minstack.peek()>=val){
            minstack.push(val);
        }
    }
    
    public void pop() {
        int poppedVal = stack.pop();
        if(poppedVal==minstack.peek()){
            minstack.pop();
        }     
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minstack.peek();
    }
}
