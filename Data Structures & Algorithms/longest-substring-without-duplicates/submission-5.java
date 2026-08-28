class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longest=0;

        for(int i=0; i < s.length(); i++) {
            Set<Character> set = new HashSet<>();
            set.add(s.charAt(i));
            for(int j=i+1; j < s.length(); j++) {
                if(!set.add(s.charAt(j))) {
                    break;
                }
            }
            longest = Math.max(set.size(), longest);
        }

        return longest;
    }
}

/*
use hashset
if we cant add to hashset
then 
*/