class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        _set = set()
        l=0
        n=len(s)
        longest=0

        for r in range(n):
            while s[r] in _set:
                _set.remove(s[l])
                l += 1
            _set.add(s[r])
            longest=max(longest,r-l+1)
        return longest