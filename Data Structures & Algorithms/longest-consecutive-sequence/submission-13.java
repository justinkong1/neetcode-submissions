class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }
        int res=0;
        for(int num : nums) {
            int count=1;
            if(set.contains(num-1)) continue;
            while(set.contains(num+count)) {
                count++;
            }
            res = Math.max(res,count);
        }

        return res;
    }
}
