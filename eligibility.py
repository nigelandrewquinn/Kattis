for i in range (int(input())):
	l = input().split()
	if int(l[1].split('/')[0]) > 2009 or int(l[2].split('/')[0]) > 1990:
		print(l[0],'eligible')
	
	elif int(l[3]) > 40:
		print(l[0],'ineligible')
	
	else:
		print(l[0],'coach petitions')
