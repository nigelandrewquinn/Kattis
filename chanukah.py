for i in range(int(input())):
	ans = 0
	x,y = map(int, input().split())
	print(x, int(((y*(1+y))/2)+y))