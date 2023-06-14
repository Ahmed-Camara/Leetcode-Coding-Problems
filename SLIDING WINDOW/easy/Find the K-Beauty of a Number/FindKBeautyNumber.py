class Solution:
    def divisorSubstrings(self, num: int, k: int) -> int:
        num = str(num)
        length = len(num)
        window = ""
        count = 0
        for i in range(length):
            window = num[i:i+k]
            
            if len(window) == k:
                if int(window) != 0 and int(num) % int(window) == 0:
                    count += 1
        return count
print(Solution().divisorSubstrings("240",2))
print(Solution().divisorSubstrings("430043",2))
print(Solution().divisorSubstrings("30003",3))
print(Solution().divisorSubstrings("65",1))