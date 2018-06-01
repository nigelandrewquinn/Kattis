while 1:
  c = list(map(int, input().split()))
  if c == [0, 0, 0, 0]:
    break
  n = 1080
  n += ((abs(c[0] - c[1] + 40)% 40) * 9)
  n += ((abs(c[2] - c[1] + 40)% 40) * 9)
  n += ((abs(c[2] - c[3] + 40)% 40) * 9)
  print(n)
