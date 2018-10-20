for i in range(int(input())):
    p, r, f = map(int, input().split())
    ans = 0
    while p <= f:
        p *= r
        ans += 1
    print(ans)
