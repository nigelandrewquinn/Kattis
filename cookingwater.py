n = int(input())
low, high = map(int, input().split())
ed = False
for _ in range(n-1):
  a,b = map(int, input().split())
  if a > low:
    low = a
  if b < high:
    high = b
  if low > high:
    ed = True

if ed:
  print("edward is right")
else:
  print("gunilla has a point")

