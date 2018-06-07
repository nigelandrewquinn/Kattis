s = input()
a = len(s)
x = int(0)
y = int(0)
for i in range (a):
	t = int(s[a-1-i])
	if t > 0:
		if t == 1:
			x += (2** (i+1)//2)
		if t == 2:
			y += (2** (i+1)//2)
		if t == 3:
			x += (2** (i+1)//2)
			y += (2** (i+1)//2)
print(a,x,y)   
