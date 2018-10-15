l = input().split()
ii = 0
jj=0
a = l[0]
b = l[1]
boolean = False
for i in range (len(a)):
	for j in range (len(b)):
		if a[i] == b[j]:
			ii = i
			jj = j
			boolean = True
			break
	if boolean == True:
		break

for i in range (len(b)):
		for j in range (len(a)):
			if ii == j :
				print(b[i], end = "")
			elif jj == i:
				print(a[j], end = "")
			else:
				print(".", end = "")
		print()		
