class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        zeros=0
        product=1
        for i in nums:
            if i==0:
                zeros+=1
                if zeros == 2:
                    return [0]*len(nums)
            else:
                product=product*i
        res=[0]*len(nums);
        for i in range(len(nums)):
            if zeros==1:
                if nums[i]==0:
                    res[i]=product
            else:
                res[i]=product//nums[i]
        return res