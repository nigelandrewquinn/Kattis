ans = 0.0
l = [1.0]
for i in range (1,int(input())+1):
	l.append(i*l[i-1])
for i in l:
	ans += 1/i
print(ans)