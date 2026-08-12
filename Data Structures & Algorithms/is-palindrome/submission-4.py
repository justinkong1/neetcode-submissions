class Solution:
    def isPalindrome(self, s: str) -> bool:
        l,r=0,len(s)-1
        while l<r:
            if self.alphanum(s[l]) != True:
                l+=1
                continue
            if self.alphanum(s[r]) != True:
                r-=1
                continue
            if s[l].lower()!=s[r].lower():
                return False
            l+=1
            r-=1
        return True
    
    def alphanum(self, c):
        return (ord('a')<=ord(c)<=ord('z') or
        ord('A')<=ord(c)<=ord('Z') or
        ord('0')<=ord(c)<=ord('9'))