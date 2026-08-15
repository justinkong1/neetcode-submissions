class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        res=[0]*(len(nums)*2)
        n=len(nums)
        for i in range(n):
            res[i]=nums[i]
            res[n+i]=nums[i]
        return res