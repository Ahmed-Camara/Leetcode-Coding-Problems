def findMaxConsecutiveOnes(nums):
    count = 0
    maxCount = -1

    for i in range(len(nums)):
        for j in range(i+1,len(nums)):

            if nums[i] != nums[j]:
                break
            else:
                count = count + 1
        if count > maxCount:
            maxCount = count
            count = 0
    return maxCount


num = [1,1,0,1,1,1]
print(findMaxConsecutiveOnes(num))

num = [1,0,1,1,0,1]
print(findMaxConsecutiveOnes(num))

num = [0]
print(findMaxConsecutiveOnes(num))