from math import sqrt

ar = input().split()
n = int(ar[0]) 
k = int(ar[1])
count = int(0)
sieve = [True]*(n+1)
i = int(2)
fin = 0

while i < n+1 and fin == 0:
  j = i
  if sieve[j]:
    j += i
    count += 1
  if count == k:
    print(j-i)
    fin = 1
    break
  while j < n+1 and fin == 0:
    if sieve[j]:
      sieve[j] = False
      count += 1
    if count == k:
      print(j)
      fin = 1
    j += i
  i += 1

