class Solution(object):
    def nextGreaterElement(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        hashIndex = {n:i for i, n in enumerate(nums1)}
        elements = [-1] * len(nums1)
        
        for i in range(len(nums2)):

            if nums2[i] in hashIndex:
                for j in range(i + 1,len(nums2)):
                    if nums2[j] > nums2[i]:
                        ids = hashIndex[nums2[i]]
                        elements[ids] = nums2[j]
                        break
                    

        
        return elements
    
print(Solution().nextGreaterElement([4,1,2],[1,3,4,2]))

print(Solution().nextGreaterElement([2,4],[1,2,3,4]))

print(Solution().nextGreaterElement([1,3,5,2,4],[6,5,4,3,2,1,7]))