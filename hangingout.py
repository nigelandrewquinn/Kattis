safe, event = map(int, input().split())
ans = int(0)
ter = int(0)

for i in range (0, event):
  n = input().split()
  if(n[0] == "enter"):
    if((ter+int(n[1])) <= safe):
      ter+=int(n[1])
    else:
      ans += 1
  else:
    ter-=int(n[1])

print(ans)
