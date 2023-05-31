class Solution(object):

    def findPoisonedDuration(self,timeSeries, duration):
    
        total = 0
        for i in range(len(timeSeries)-1):
            total = total + min((timeSeries[i+1]-timeSeries[i]), duration)
        return total + duration

timeSerie = [1,4]
durations = 2
print(Solution().findPoisonedDuration(timeSerie,durations))

timeSerie = [1,2]
durations = 2

print(Solution().findPoisonedDuration(timeSerie,durations))