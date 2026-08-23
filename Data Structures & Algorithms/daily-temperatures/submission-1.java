class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];

        // stack SHOULD contain numbers that need to find the warmer temperature
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < n; i++) {
            if(!stack.isEmpty()) {
                while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                    int peek=stack.pop();
                    res[peek] = i-peek;
                }
            }
            stack.push(i);
        }
        return res;
    }
}
