class NumArray(object):

    def __init__(self, nums):
        """
        :type nums: List[int]
        """
        self.nums = nums
        

    def sumRange(self, left, right):
        """
        :type left: int
        :type right: int
        :rtype: int
        """
        temp = self.nums[left:right+1]
        sumNumber = sum(temp)
        
        return sumNumber

print(NumArray([-2, 0, 3, -5, 2, -1]).sumRange(0,2))


        
