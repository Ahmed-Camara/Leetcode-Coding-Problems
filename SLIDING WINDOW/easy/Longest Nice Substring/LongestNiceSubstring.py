class Solution:
    def longestNiceSubstring(self, s: str) -> str:
        longestSubstring = "d"

        length = len(s)

        for i in range(length):
            pass
        return "" if length <= 1 else longestSubstring


print(Solution().longestNiceSubstring("YazaAay"))
print(Solution().longestNiceSubstring("Bb"))
print(Solution().longestNiceSubstring("c"))
