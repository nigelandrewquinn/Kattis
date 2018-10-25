input() 
ans = 0 
l = sorted(map(int,input().split()), reverse = True) 
for i in range (2, len(l), 3):
	ans += l[i]
print(ans)
