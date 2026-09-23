class Solution {
    public boolean isSubsequence(String s, String t) {
        int p=-1;
        for(int i=0;i<s.length();i++){
            boolean charFound=false;
            while(p < t.length()-1) {
                p++;
                if(s.charAt(i) == t.charAt(p)) {
                    charFound=true;
                    break;
                }
            }
            if(!charFound) {
                return false;
            }

        }

        return true;
    }
}

/*
node
length: 4

neetcode
length: 8

(n)eetc(o)(d)(e)

search through the array 
*/