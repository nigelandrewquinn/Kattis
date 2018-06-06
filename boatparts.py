p,n = map(int, input().split(" "))
hs = set()
count = int(0)
par = True
for i in range (n):
  s = str(input())
  
  if s in hs:
    hs.add(s)
  
  else:
    hs.add(s)
    count+=1
    if count==p:
      ans = i+1
      par = False

if par:
  print("paradox avoided")
else:
  print(ans)
