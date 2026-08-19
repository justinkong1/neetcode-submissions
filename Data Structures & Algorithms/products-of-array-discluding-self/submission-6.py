# arr=[1,3,5,7]
# pre=[1,3,15,105]
# post=[105,105,35,7]
# res=pre*post
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        res=[1]*len(nums)
        pre=[0]*len(nums)
        post=[0]*len(nums)

        prenum=1
        for i in range(len(nums)):
            pre[i]=prenum
            prenum=prenum*nums[i]
        postnum=1
        for i in range(len(nums)-1,-1,-1):
            post[i]=postnum
            postnum=postnum*nums[i]
        for i in range(len(nums)):
            res[i]=pre[i]*post[i]
        return res