class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length < 2) {
            return nums.length;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums) {
            map.putIfAbsent(i,1);
        }

        int maxConsec=1;
        for(int i:nums) {
            int count=1;
            if(map.containsKey(i-1)) continue;
            while(map.containsKey(i+count)) {
                count++;
            }
            maxConsec=Math.max(count,maxConsec);
        }
        return maxConsec;
    }
}
