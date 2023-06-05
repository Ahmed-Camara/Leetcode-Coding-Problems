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
        while right < length:

            if prices[left] < prices[right]:
                profit = prices[right] - prices[left]
                maxProfit = max(maxProfit, profit)
            else:
                left = right
            right = right + 1

        return maxProfit


print(Solution().maxProfit([7, 1, 5, 3, 6, 4]))
print(Solution().maxProfit([7, 6, 4, 3, 1]))
print(Solution().maxProfit([2, 1, 2, 1, 0, 1, 2]))
print(Solution().maxProfit([1, 2, 4, 2, 5, 7, 2, 4, 9, 0, 9]))
