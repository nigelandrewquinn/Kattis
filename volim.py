player = int(input())-1
n = int(input())
timer = int(210)
for i in range(n):
	s =input().split()
	t = int(s[0])
	a = str(s[1])
	timer -= t
	if timer <= 0 :
		break
	if a == "T":
		player = (player+1)%8	
print(player+1)

