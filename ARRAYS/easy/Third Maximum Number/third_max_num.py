num = [3, 2,2, 1]


def thirdMax(nums):
    max,secondMax,thirdMax = float('-inf'),float('-inf'),float('-inf')

    for num in nums:
        if num > max:
            thirdMax = secondMax
            secondMax = max
            max = num
        elif num > secondMax and num < max:
            thirdMax = secondMax
            secondMax = num

        elif num > thirdMax and num < secondMax:
            thirdMax = num

    result = max if thirdMax == float('-inf') else thirdMax
    return result
print(thirdMax(num))
