r, c, zr, zc = map(int, input().split())
for i in range (0,r):
  s = input()
  for j in range (0, zr):
    for k in range (0, len(s)):
      for l in range (0,zc):
        print(s[k], end="")
    print()
