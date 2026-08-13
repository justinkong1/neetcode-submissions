class Solution:
    def maxArea(self, heights: List[int]) -> int:
        area = 0
        l,r=0,len(heights)-1
        while l<r:
            dist=r-l
            area=max(dist*min(heights[l],heights[r]),area)

            if heights[l] < heights[r]:
                l+=1
            else:
                r-=1

        return area