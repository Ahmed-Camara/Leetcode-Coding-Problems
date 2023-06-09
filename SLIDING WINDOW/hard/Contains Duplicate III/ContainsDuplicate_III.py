class Solution(object):
    def containsNearbyAlmostDuplicate(self, nums, indexDiff, valueDiff):
        """
        :type nums: List[int]
        :type indexDiff: int
        :type valueDiff: int
        :rtype: bool
        """

        if nums == [] and indexDiff < 0 and valueDiff < 0:
            return False
            
        return False

print(Solution().containsNearbyAlmostDuplicate([1,2,3,1],3,0)) #true
print(Solution().containsNearbyAlmostDuplicate([1,5,9,1,5,9],2,3)) #false
print(Solution().containsNearbyAlmostDuplicate([1,2,1,1],1,0)) #true