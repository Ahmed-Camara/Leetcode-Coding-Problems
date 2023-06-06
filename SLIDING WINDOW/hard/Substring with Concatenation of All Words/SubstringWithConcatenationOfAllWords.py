class Solution(object):
    def findSubstring(self, s, words):
        """
        :type s: str
        :type words: List[str]
        :rtype: List[int]
        """

        results = [1,2]
        window = ""
        windowSize = sum(len(word) for word in words)
        print("windowSize : ",windowSize)
        
        return results.sort()
    
print(Solution().findSubstring("barfoothefoobarman",["foo","bar"]))
print(Solution().findSubstring("wordgoodgoodgoodbestword",["word","good","best","word"]))
print(Solution().findSubstring("barfoofoobarthefoobarman",["bar","foo","the"]))
#print(Solution().findSubstring("bbbbb",))