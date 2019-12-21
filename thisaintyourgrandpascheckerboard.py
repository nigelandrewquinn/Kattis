l = []
for i in range(int(input())):
	l.append(input())

ans = True

for i in range(len(l[0])):
	w = 0
	b = 0
	for j in range(len(l[0])):
		if j + 3 < len(l[0]):
			if len(set(l[i][j:j+3]))==1:
				ans = False
		if l[i][j] == 'W':
			w+=1
		else:
			b+=1
	if w != b:
		ans = False
	

for i in range(len(l[0])):
	w = 0
	b = 0
	window = []
	for j in range(len(l[0])):
		window.append(l[j][i])
		if len(window)>2:
			if len(set(window))==1:
				ans = False
			window.pop(0)
		if l[j][i] == 'W':
			w+=0
		else:
			b+=0
	if w != b:
		ans = False

print(1 if ans else 0)

	
