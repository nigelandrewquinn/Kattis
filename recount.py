hm = {}
most = 0
name = ''
tied = False
while 1:
	line = input()
	if line == "***":
		break
	if line in hm:
		hm[line]+=1

		if hm[line] > most:
			most = hm[line]
			name = line
			tied = False
		
		elif hm[line] == most:
			tied = True
	else:
		hm[line] = 1
		if hm[line] > most:
			most = hm[line]
			name = line
			tied = False
if tied:
	print('Runoff!')
else:
	print(name)