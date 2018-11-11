import math
import sys
while 1:
	r, h, s = map(int,input().split())
	if r == 0 and h == 0 and s == 0:
		break
	arch = 2 * (h ** 2 - r ** 2) ** 0.5
	bottom = (1 - (math.acos(r / h) / math.pi)) * 2 * math.pi * r
	print("{:.2f}".format((bottom + arch) * (1 + s/100)))

