l = set()
for i in range (int(input())):
	n,m = map(int, input().split())
	for j in range(n, m+1):
 		l.add(j)
print(len(l))