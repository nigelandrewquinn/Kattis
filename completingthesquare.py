def distance(x1, y1, x2, y2):
    return ((x2-x1)**2 + (y2-y1)**2)**1/2

a1, a2 = map(int, input().strip().split())
b1, b2 = map(int, input().strip().split())
c1, c2 = map(int, input().strip().split())

d = distance(a1, a2, b1, b2)
x1, x2, y1, y2, z1, z2 = a1, a2, b1, b2, c1, c2

if distance(b1, b2, c1, c2) > d:
    x1, x2, y1, y2, z1, z2 = b1, b2, c1, c2, a1, a2

if distance(c1, c2, a1, a2) > d:
    x1, x2, y1, y2, z1, z2 = a1, a2, c1, c2, b1, b2

print(int(((x1+y1)/2*2)-z1), int( ((x2+y2)/2*2)-z2))