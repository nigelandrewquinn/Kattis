a,b,c = map(int, input().split())
x = b-a
if c-b > x:
	x = c-b
print(x-1)
