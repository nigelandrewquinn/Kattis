import sys
lines = sys.stdin.readlines()
l = []
biggest = 0
for line in lines:
		l.append(len(line))
		if len(line) > biggest:
			biggest = len(line)
ans = 0
for i in range (len(l)-1):
	ans += (biggest - l[i])**2
print(ans)
