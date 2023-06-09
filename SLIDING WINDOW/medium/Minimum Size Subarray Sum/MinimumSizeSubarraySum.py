class Solution(object):
    def minSubArrayLen(self, target, nums):
        """
        :type target: int
        :type nums: List[int]
        :rtype: int
        """
        j = 0
        windowSum = 0
        maxLength = len(nums) + 1

        for i in range(len(nums)):
            windowSum = windowSum + nums[i]

            while windowSum >= target:
                maxLength = min(i-j+1,maxLength)
                windowSum = windowSum - nums[j]
                j = j + 1
        return j if j == 0 else maxLength

print(Solution().minSubArrayLen(7,[2,3,1,2,4,3]))
print(Solution().minSubArrayLen(4,[1,4,4]))
print(Solution().minSubArrayLen(11,[1,1,1,1,1,1,1,1]))