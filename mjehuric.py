ar = list(map(int, input().split()))
n = len(ar)
for i in range(n):
  for j in range(0, n-i-1):
    if ar[j] > ar[j+1]:
      ar[j], ar[j+1] = ar[j+1], ar[j]
      for p in ar: print (p," ", end="")
      print()
