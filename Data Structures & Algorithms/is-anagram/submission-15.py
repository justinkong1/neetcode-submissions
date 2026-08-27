class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        m={}
        for c in s:
            if c in m:
                m[c] += 1
            else:
                m[c] = 1
        
        for c in t:
            if c in m:
                m[c] -= 1
        
        for k in m:
            if m[k] > 0:
                return False
        return True