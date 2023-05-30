

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
