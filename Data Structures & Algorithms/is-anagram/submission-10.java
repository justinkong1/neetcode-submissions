class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] arr = new int[26];

        for(int i=0;i<s.length();i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            
            arr[sChar - 'a'] ++;
            arr[tChar - 'a'] --;
        }

        for(int i : arr) {
            if(i > 0) return false;
        }

        return true;
    }
}
