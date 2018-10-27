import math
n = int(input())
ans = 0
if n == 1:
	ans = 0
else:
	for i in range (n,1,-1):
		ans += (math.factorial(n))/(math.factorial(i)*(math.factorial(n-i)))	
print(int(ans))