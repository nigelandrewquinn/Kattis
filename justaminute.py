i, j = 0, 0
n = int(input())
for _ in range(n):
    a, b = map(int, input().split())
    i += (a*60)
    j += b
if j/i <= 1:
    print("measurement error")
else:
    print(j/i)
