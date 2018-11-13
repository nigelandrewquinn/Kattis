for i in range(int(input())):
    n = int(input())
    a = sorted(map(int, input().split()))
    b = sorted(map(int, input().split()), reverse=True)
    tot = 0
    for j in range(n):
        tot += a[j]*b[j]
    print('Case #{}: {}'.format(i+1, tot))