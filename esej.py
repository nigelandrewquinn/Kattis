s = "abcdefghijklmnopqrstuvwxyz"
a, b =  map(int, input().split())
count = int(0)
for i in range (0,25):
	for j in range (0,25):
		for k in range (0,25):
			for q in range (0,25):
				st = str(s[i]+s[j]+s[k]+s[q])
				print(str(st),"",end = "")
				count+=1
				if count == b: exit()		
