n = int(input())
ans = 0
l = []
for i in range(n):
        l.append(int(input()))
if n % 2 == 1:
    print('still running')
else:
    for i in range(0, n-1, 2):
        ans += l[i+1] - l[i]
    print(ans)
