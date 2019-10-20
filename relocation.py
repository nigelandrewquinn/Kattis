def move(a,b):
    dat[a] = b

def distance(a,b):    
    print(abs(dat[a]-dat[b]))

n, q = map(int, input().split())
dat = {}
l = list(map(int, input().split()))
for i in range(n):
    dat[i+1] = l[i]
for i in range(q):
    a, b, c = map(int, input().split())
    if a == 1:
        move(b, c)
    else:
        distance(b, c)

