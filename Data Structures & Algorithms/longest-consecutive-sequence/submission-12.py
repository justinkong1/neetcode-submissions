class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if len(nums) < 2:
            return len(nums)
        m={}
        for num in nums:
            m[num]=1
        res=1
        for num in nums:
            count=1
            if num-1 in m:
                continue
            while num+count in m:
                count+=1
            res=max(count,res)
        return res