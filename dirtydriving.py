N, P = map(int, input().split())
a = sorted(map(int, input().split()))
ans = 0
for n in range(len(a)):
    a[0] - (a[n]-P*(n+1))
    if a[0] - (a[n]-P*(n+1)) > ans:
        ans = a[0] - (a[n]-P*(n+1))
print(ans)
