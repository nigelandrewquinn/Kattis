for i in range(int(input())):
    k, b, n = map(int, input().split())
    ans = 0
    while n > 0:
        v = n % b
        ans += v * v
        n //= b
    print(k, ans)