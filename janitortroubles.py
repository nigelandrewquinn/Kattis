import math 

a, b, c ,d = map(int, input().split())
sp = (a + b + c + d) / 2
print(math.sqrt((sp - a) * (sp - b) * (sp - c) * (sp - d))) 

