class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        count=[0]*26
        for i in range(len(s)):
            indexS=ord(s[i])-ord('a')
            indexT=ord(t[i])-ord('a')
            count[indexS]+=1
            count[indexT]-=1
        for num in count:
            if num > 0:
                return False
        return True