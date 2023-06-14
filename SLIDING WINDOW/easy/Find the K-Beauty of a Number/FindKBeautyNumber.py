class Solution(object):
    def divisorSubstrings(self, num, k):
        """
        :type num: int
        :type k: int
        :rtype: int
        """
        length = len(num)
        text = ""
        count = 0
        for i in range(length):
            
            text = text + num[i]
            #print("text : ",text)
            if len(text) == k:
                if int(text) != 0 and int(num) % int(text) == 0:
                    count = count + 1
                text = num[i]
        return count
print(Solution().divisorSubstrings("240",2))
print(Solution().divisorSubstrings("430043",2))
print(Solution().divisorSubstrings("30003",3))
print(Solution().divisorSubstrings("65",1))