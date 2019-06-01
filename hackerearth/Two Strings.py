t=int(input())
while t:
    a,b=[list(i) for i in input().split()]
    a.sort()
    b.sort()
    if a==b:
        print "YES"
    else:
        print "NO"
    t-=1