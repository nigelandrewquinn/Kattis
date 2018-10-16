def arithmetic(n):
	dif = n[1]-n[0]
	for i in range(len(n)-1):
		if dif != n[i+1] - n[i]: return False
	return True

def perithmetic(n):
	n.sort()
	dif = n[1]-n[0]
	for i in range(len(n)-1):
		if dif != n[i+1] - n[i]: return False
	return True

for i in range(int(input())):
	n = list(map(int, input().split()[1:]))
	if arithmetic(n): print("arithmetic")
	elif perithmetic(n): print("permuted arithmetic")	
	else: print("non-arithmetic")

