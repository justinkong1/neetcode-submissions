class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length < 2) return nums.length;
        Arrays.sort(nums);
        int consec=1;
        int lastNum=nums[0];
        int maxConsec=1;
        for(int i = 1; i < nums.length; i++) {
            int curNum = nums[i];
            if(lastNum==curNum) continue;
            if(lastNum+1==curNum) {
                consec++;
            } else {
                consec=1;
            }
            lastNum=curNum;
            maxConsec = Math.max(maxConsec,consec);
        }
        return maxConsec;
    }
}
/*

*/