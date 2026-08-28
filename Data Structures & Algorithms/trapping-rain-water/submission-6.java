class Solution {
    public int trap(int[] height) {
        if(height == null || height.length == 0) return 0;
        int n=height.length;
        int[] maxLeftArr=new int[n];
        int[] maxRightArr=new int[n];

        int maxLeft=0;
        int maxRight=0;

        for(int i = 0; i < n; i++ ){
            maxLeft = Math.max(height[i], maxLeft);
            maxLeftArr[i] = maxLeft;
        }
        for(int i = n-1; i >= 0; i--) {
            maxRight = Math.max(height[i], maxRight);
            maxRightArr[i] = maxRight;
        }
        int sum=0;
        for(int i = 0; i < n; i++) {
            sum += Math.max(0,Math.min(maxLeftArr[i],maxRightArr[i]) - height[i]);
        }
        return sum;
    }
}
