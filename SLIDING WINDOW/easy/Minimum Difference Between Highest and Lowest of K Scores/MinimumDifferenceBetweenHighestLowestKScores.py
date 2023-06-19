from typing import List


class Solution:
    def minimumDifference(self, nums: List[int], k: int) -> int:

        length = len(nums)

        if length <= 1:
            return 0

        minDiff = float('inf')
        nums.sort()
        for i in range(length - k + 1):
            minDiff = int(min(nums[i+k-1] - nums[i], minDiff))

        return minDiff


print(Solution().minimumDifference(nums=[90], k=1))
print(Solution().minimumDifference(nums=[9, 4, 1, 7], k=2))
print(Solution().minimumDifference(
    [87063, 61094, 44530, 21297, 95857, 93551, 9918], k=6))
