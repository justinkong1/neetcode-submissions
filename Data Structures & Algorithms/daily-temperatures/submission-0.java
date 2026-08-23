class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];

        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                if(temperatures[j] > temperatures[i]) {
                    res[i] = j-i;
                    break;
                }
            }
        }

        return res;
    }
}
/*
return an array of size n where n is size of temperatures
result[i] = days after i BEFORE a warmer temp appears on a future day
if NO days in future for warmer temperature for ith day, set to 0

temperatures=[30,38,30]

result=[1,0,0]
we know last day will be 0

STACK is LIFO

populate stack:
    iterate through temperatures:
        - put temp[i] in stack
iterate through temperatures:

*/
