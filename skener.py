r, c, zr, zc = map(int, input().split())
for i in range (0,r):
  s = input()
  for j in range (0, zr):
    for k in range (0, len(s)):
      print(s[k]*zc, end="")
    print()
