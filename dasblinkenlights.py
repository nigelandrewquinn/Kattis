def gcd(a,b):     
   if b == 0:
     return a
   remainder = a % b
   return gcd(b,remainder)

def lcm(a, b):
  return int( (a*b) / gcd(a,b))

p, q, s = map(int, input().split())

if lcm(p,q) <= s:
	print('yes')
else:
	print('no')