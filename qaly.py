ans = 0
for i in range(int(input())):
	a,b = map(float, input().split())
	ans += a*b
print(ans)