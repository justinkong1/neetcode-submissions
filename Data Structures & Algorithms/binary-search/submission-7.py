class Solution:
    def search(self, nums: List[int], target: int) -> int:
        low,high=0,len(nums)

        while low<=high:
            mid=high-low-1
            if nums[mid] == target:
                return mid
            elif nums[mid] > target:
                high -= 1
            elif nums[mid] < target:
                low += 1
        return -1