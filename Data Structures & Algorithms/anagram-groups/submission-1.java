class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();

        for(String s : strs) {
            char[] sArr = s.toCharArray();
            Arrays.sort(sArr);
            String sortedS = new String(sArr);

            if(map.containsKey(sortedS)) {
                map.get(sortedS).add(s);
            } else {
                List<String> group = new ArrayList<>();
                group.add(s);
                res.add(group);
                map.put(sortedS, group);
            }
        }

        return res;
    }
}
