import math
while True:
  D, V = map(float, input().split())
  if (D==0 and V==0):
    break
  print((((math.pi*(D**3))-(6*V))/math.pi)**(1/3))
