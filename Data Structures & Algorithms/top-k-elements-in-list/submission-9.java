class Solution {

    class NumberAndCounter {
        public int num;
        public int counter;

        NumberAndCounter(int num) {
            this.num = num;
            counter = 1;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        List<NumberAndCounter> numbsList = new ArrayList<>();
        Map<Integer, NumberAndCounter> map = new HashMap<>();
        for(int i : nums) {
            if(map.containsKey(i)) {
                NumberAndCounter nc = map.get(i);
                nc.counter ++;
            } else {
                NumberAndCounter nc = new NumberAndCounter(i);
                map.put(i, nc);
                numbsList.add(nc);
            }
        }
        numbsList.sort(Comparator.comparingInt( (nc) -> nc.counter));

        int[] result = new int[k];
        int n = numbsList.size()-1;
        for(int i = 0; i < result.length; i++) {
            result[i] = numbsList.get(n-i).num;
        }
        return result;
    }
}
