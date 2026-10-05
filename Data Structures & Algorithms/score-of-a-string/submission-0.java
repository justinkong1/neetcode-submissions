class Solution {
    public int scoreOfString(String s) {
        int score = 0;
        for(int i = 1; i < s.length(); i++) {
            int prev = (int) s.charAt(i-1);
            int curr = (int) s.charAt(i);

            int result = Math.abs(curr - prev);
            score += result;
        }
        return score;
    }
}