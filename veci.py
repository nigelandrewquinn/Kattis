from itertools import permutations
import sys
max = sys.maxsize

arr = input()
list(arr)

a = permutations(arr)
na = [i for i in a]
for i in range (len(na)):
	s = ""
	for j in range(len(na[i])):
		x = na[i]
		s += str(x[j])
	int(s)	
	if int(s) > int(arr) and int(s) < int(max):
		max = s
if max == sys.maxsize:		
	print(0)
else:
	print(max)
				
