class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """

        length = len(s)

        if length == 0 or length == 1:
            return length

        maxCount = -1
        window = ""
        length = len(s)
        for i in range(length):

            strs = s[i]

            if strs in window:
                window = window[window.index(strs)+1:]
            window = window + strs
            maxCount = max(maxCount, len(window))
        return maxCount


print(Solution().lengthOfLongestSubstring("abcabcbb"))
print(Solution().lengthOfLongestSubstring("pwwkew"))
print(Solution().lengthOfLongestSubstring("aab"))
print(Solution().lengthOfLongestSubstring("bbbbb"))
