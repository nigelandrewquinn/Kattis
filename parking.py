a, b, c =  map(int, input().split())
x = input().split()
x0 = int(x[0])
x1 = int(x[1])
low = x0
high = x1
total = int(0)

y = input().split()
y0 = int(y[0])
y1 = int(y[1])
if y0 < low: 
	low = y0
if y1 > high:
	high = y1

z = input().split()
z0 = int(z[0])
z1 = int(z[1])
if low > z0:
	low = z0
if high < z1:
	high = z1


for i in range (low+1, high+1):
	space = int(0)
	if i > x0 and i <= x1:
		space += 1
	if i > y0 and i <= y1:
		space += 1
	if i > z0 and i <= z1:
		space += 1

	if space == 1:
		total += a
	if space == 2:
		total += b*2
	if space == 3:
		total += c*3

print(total)		
