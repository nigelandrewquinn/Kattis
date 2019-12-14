a, b, c, n = map(int, input().split())
if a < 1 or b < 1 or c < 1 or n<3 or (a+b+c) < n:
	print('NO')
else:
	print('YES')
