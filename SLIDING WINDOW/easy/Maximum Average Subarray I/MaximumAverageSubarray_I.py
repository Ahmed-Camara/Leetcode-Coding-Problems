class Solution(object):
    def findMaxAverage(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: float
        """
        length = len(nums)
        if length == 1:
            return nums[0]
        
        
        maxAverage = -1
        sumNums = 0
        j = 0
        i = 0
        
        for i in range(length):
            sumNums = sumNums + nums[i]
            if i - j + 1  == k:
                avg = sumNums / k
                maxAverage = max(maxAverage,avg)
                sumNums = sumNums - nums[j]
                j = j + 1
            
        return maxAverage

print(Solution().findMaxAverage([1,12,-5,-6,50,3],4))
print(Solution().findMaxAverage([5],1))