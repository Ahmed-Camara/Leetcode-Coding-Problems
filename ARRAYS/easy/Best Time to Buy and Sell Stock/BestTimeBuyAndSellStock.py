class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        maxProfit = 0
        left = 0
        right = 1

        length = len(prices)
        while left < length and right < length:
            
            profit = prices[right] - prices[left]

            if right == length:
                left = left + 1
                right = left + 1

            if profit < 0:
                right = right + 1
                left = left + 1
            else:
                maxProfit = max(maxProfit,profit)
                right = right + 1
            

        return maxProfit

print(Solution().maxProfit([7,1,5,3,6,4]))
print(Solution().maxProfit([7,6,4,3,1]))
print(Solution().maxProfit([2,1,2,1,0,1,2]))
print(Solution().maxProfit([1,2,4,2,5,7,2,4,9,0,9]))