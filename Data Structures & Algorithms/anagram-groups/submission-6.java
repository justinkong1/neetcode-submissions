class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs) {
            int[] count = new int[26];
            for(char c : s.toCharArray()){
                count[c-'a']++;
            }
            String sorted = Arrays.toString(count);
            if(map.containsKey(sorted)) {
                map.get(sorted).add(s);
            } else {
                map.put(sorted, new ArrayList<>());
                map.get(sorted).add(s);
            }
        }
        return new ArrayList<>(map.values());
    }
}
