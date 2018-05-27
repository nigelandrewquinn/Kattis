n = int(input())
for i in range (0,n):
  x = list(map(int, input().split()))
  ans = int(0)
  n = 1
  for j in range (0, len(x)):
    if(x[j]==0):
      break
    if((n*2) <= x[j]):
      ans += x[j]-(n*2)
    n = x[j]
  print(ans)
