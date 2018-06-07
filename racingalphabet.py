import math
a = "ABCDEFGHIJKLMNOPQRSTUVWXYZ '"
c = math.pi*60
t = int(input())

for _ in range (t):
	s = input()
	cur = s[0]
	tot = int(0)
	for i in range (1,len(s)):
		tot += min(((a.index(s[i]) - a.index(cur)) % 28), ((a.index(cur) - a.index(s[i])) % 28))
		cur = s[i]

	print((c/28/15*tot)+len(s))	
