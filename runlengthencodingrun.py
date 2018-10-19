l = input().split()
a = l[1]
count = 1
if l[0] == 'D':
	
	for i in range(0,len(a)-1,2):
		print(a[i]*int(a[i+1]), end = "")
else:
	j = 0
	while j < len(a)-1:
		 if a[j] != a[j+1]:
		 	print(a[j]+str(count), end = "")
		 	count = 1
		 	j+=1
		 else:
		 	count+=1
		 	j+=1
	if count == 1:
		print(str(a[len(a)-1]+'1'))
	else:
		print(str(a[j]+str(count)))
		 

	




