lowest = 10000000000
day = 0
input()
l = list(map(int, input().split()))
for i in range(len(l)):
	t = l[i]
	if t < lowest:
		lowest = t
		day = i 
print(day)
