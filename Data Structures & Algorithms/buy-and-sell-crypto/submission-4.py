class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        maxP=0
        l=0
        r=1
        n=len(prices)
        while r<n:
            if prices[l]<prices[r]:
                maxP=max(maxP,prices[r]-prices[l])
            else:
                l=r
            r+=1
        return maxP