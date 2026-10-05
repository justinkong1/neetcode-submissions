class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        for(int i = s.length()-1; i >= 0; i--) {
            if(length == 0) {
                if(s.charAt(i) == ' ') {
                    continue;
                }
            }
            if(s.charAt(i) == ' ') {
                return length;
            } else {
                length ++;
            }
        }
        return length;
    }
}
/*
start from the end of the string
find a space
then the length is the counter until we reach space
return that length.

if we don't find a space, that means its just one single word.
*/