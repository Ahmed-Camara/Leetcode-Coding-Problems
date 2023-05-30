

def findContentChildren(g, s):
    i = 0
    j = 0
    g.sort()
    s.sort()
    lenG = len(g)
    lenS = len(s)

    while i < lenG and j < lenS:

        if s[j] >= g[i]:
            i = i + 1
            j = j  + 1
        else:
            j = j  + 1
    return i

g = [1,2,3]
s = [1,1]
c = findContentChildren(g,s)
print(c)


g = [1,2]
s = [1,2,3]
c = findContentChildren(g,s)
print(c)


g = [1,2,3]
s = [3]
c = findContentChildren(g,s)
print(c)