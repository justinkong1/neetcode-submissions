class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums=sorted(nums)
        n=len(nums)
        res=defaultdict(list)
        for i in range(n):
            l,r=i+1,n-1
            while l<r:
                if nums[i]+nums[l]+nums[r]==0:
                    t=tuple(sorted([nums[i],nums[l],nums[r]]))
                    if t not in res:
                        res[t]=[nums[i],nums[l],nums[r]]
                if nums[l]+nums[r]+nums[i]<0:
                    l+=1
                else:
                    r-=1
        return list(res.values())