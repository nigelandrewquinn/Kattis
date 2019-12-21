n, h, v = map(int, input().split())
v1 = h*v
v2 = (n-h)*v
v3 = (n-v)*(n-h)
v4 = (n-v)*h
print(max([v1,v2,v3,v4])*4)
