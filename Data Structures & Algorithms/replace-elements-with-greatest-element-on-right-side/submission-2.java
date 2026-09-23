class Solution {
    public int[] replaceElements(int[] arr) {
        int greatest = -1;
        for(int i = arr.length-1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = greatest;
            greatest = Math.max(greatest,temp);
        }
        //arr[arr.length-1] = -1;
        return arr;
    }
}
/*
[2,4,5,3,1,2]
[5,3,2,2,-1]

start from the end


answer:
[5,5,3,2,2,-1]
*/