t = int(input())
n = 0
a,b  = map(float, input().split())
for i in range (t-1):
    c,d  = map(float, input().split())
    n += ((b+d)/2)*(c-a)
    a = c
    b = d
print(n/1000)

