import re
p,t = map(int, input().split(" "))
count = int(0)
for _ in range (p):
  pas = True
  for i in range (t):
    if re.search("([A-Z])", input()[1:]):
      pas = False
  if pas:
    count+=1
print(count)        
