class MinStack {
    private Stack<Integer> stack;
    private Map<Integer, Integer> minMap;
    private Integer size;
    public MinStack() {
        stack = new Stack();
        minMap = new HashMap<>();
        size=0;
    }
    
    public void push(int val) {
        size ++;
        if(!stack.isEmpty()) {
            minMap.put(size, Math.min(minMap.get(size-1), val));
        } else {
            minMap.put(size, val);
        }
        stack.push(val);
    }
    
    public void pop() {
        stack.pop();
        size--;
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        System.out.println(minMap.get(size));
        return minMap.get(size);
    }
}