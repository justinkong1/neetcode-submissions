class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1) return strs[0];
        
        String first = strs[0];
        int[] count = new int[first.length()];

        // As long as it matches the first word that is all that matters.
        for(int sIndex = 1; sIndex < strs.length; sIndex++) {
            String curr = strs[sIndex];
            // get count of characters
            // we need to determine the smaller string between the two
            int smallestLength = Math.min(curr.length(), first.length());
            for(int i = 0; i < smallestLength; i++) {
                // only check if it's matching
                if(curr.charAt(i) == first.charAt(i)) {
                    count[i] ++;
                } else {
                    // if the first letter already isn't matching, then we can assume there isn't a longest common prefix.
                    if(i == 0) {
                        return "";
                    }
                    break;
                }
            }
        }
        StringBuilder cpString = new StringBuilder();// common prefix string
        for(int i = 0; i < count.length; i++) {
            if(count[i] == strs.length-1) {
                cpString.append(first.charAt(i));
            }
        }

        return cpString.toString();
    }
}