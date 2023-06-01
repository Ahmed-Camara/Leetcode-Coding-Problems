class Solution(object):

    def findMaxConsecutiveOnes(self,nums):
        maxCount = 0


        count = 0

        for i in range(len(nums)):

            if nums[i] == 0:
                count = 0
            elif nums[i] == 1:
                count = count + 1
                maxCount = max(count,maxCount)
        
         
        return maxCount


num = [1,1,0,1,1,1]
print(Solution().findMaxConsecutiveOnes(num))

num = [1,0,1,1,0,1]
print(Solution().findMaxConsecutiveOnes(num))

num = [0]
print(Solution().findMaxConsecutiveOnes(num))