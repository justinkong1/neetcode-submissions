class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        List<Integer>[] freq = new List[nums.length+1];
        int i=0;
        for(i=0;i<freq.length;i++) {
            freq[i]=new ArrayList<>();
        }
        for(int num : nums) {
            count.put(num,count.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : count.entrySet()) {
            freq[entry.getValue()].add(entry.getKey());
        }

        int[] res=new int[k];
        for(i=freq.length-1;i>0 && k>0;i--) {
            for(int n : freq[i]) {
                res[--k]=n;
            }
        }
        return res;

    }
}
