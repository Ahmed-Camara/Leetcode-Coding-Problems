from typing import List

class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        length = len(nums)
        if length == 1:
            return nums[0]
        maxAverage = float('-inf')
        sums = 0
        i,j = 0,0
        
        for i in range(length):
            sums += nums[i]
            if i - j + 1 == k:
                avg = sums / k
                maxAverage = max(maxAverage,avg)
                sums -= nums[j]
                j = j + 1
                
        return maxAverage
print(Solution().findMaxAverage([1,12,-5,-6,50,3],4))
print(Solution().findMaxAverage([5],1))