class Solution(object):
    def findRelativeRanks(self, score):
        """
        :type score: List[int]
        :rtype: List[str]
        """
        sorted_scores = sorted(score, reverse=True)
        

        dict_rank = {}

        for n,i in enumerate(sorted_scores):
            
            if n == 0:
                dict_rank[i] = "Gold Medal"
            elif n == 1:
                dict_rank[i] = "Silver Medal"
            elif n == 2:
                dict_rank[i] = "Bronze Medal"
            else:
                dict_rank[i] = str(n+1)
        ranks = []

        for i in score:
            ranks.append(dict_rank[i]) 
        return ranks
    

print(Solution().findRelativeRanks([5,4,3,2,1]))
print(Solution().findRelativeRanks([10,3,8,9,4]))