import sys
import functools
import math

def lcm(a, b):
    return a*b//math.gcd(a, b)

lines = sys.stdin.readlines()
for line in lines:
	l = list(map(int,line.split()))
	print(functools.reduce(lcm, l))