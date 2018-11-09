from math import factorial

def nCr(n, r):
    return factorial(n) / ((factorial(r) * (factorial(n - r))))

for i in range(int(input())):
	n,m = map(int,input().split())
	print(int(nCr(n,m-1)))