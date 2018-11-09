import math
a,n = map(float, input().split())
r = (a/math.pi)**0.5
if n >= 2*math.pi*r:
	print('Diablo is happy!')
else:
	print('Need more materials!')
