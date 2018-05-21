n = int(input())
if (n ==0):
  print("1")
else:
  t = (n//2) + 1
  pieces = t**2
  if n%2 == 1:
    pieces += t
  print(pieces)
