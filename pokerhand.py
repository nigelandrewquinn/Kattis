l = input().split()
hm = {}
for i in l:
	t = i[0]
	if t in hm:
		hm[t] += 1
	else:
		hm[t] = 1
max = 0
for i in l:
	t = i[0]
	if hm[t] > max:
		max = hm[t]
print(max)