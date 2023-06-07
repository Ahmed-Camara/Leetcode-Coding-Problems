class Solution(object):
    def findSubstring(self, s, words):
        """
        :type s: str
        :type words: List[str]
        :rtype: List[int]
        """

        results = [5,1,2]
        window = ""
        windowSize = len(words[0])
        words_dict = {}
        all_word_len = sum(len(word) for word in words)

        for word in words:
            words_dict[word] = words_dict.get(word, 0) + 1
        
        print("windowSize : ",windowSize)
        print("len(s) : ",len(s))
        for i in range(len(s) - windowSize + 1):
            w = s[i:i + windowSize]
            if w in words:
                print("w : ",w)
        return sorted(results)
    
print(Solution().findSubstring("barfoothefoobarman",["foo","bar"]))
#print(Solution().findSubstring("wordgoodgoodgoodbestword",["word","good","best","word"]))
#print(Solution().findSubstring("accord",["bar","foo","the"]))
#print(Solution().findSubstring("bbbbb",))