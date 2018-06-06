n = int(input())
array = list(map(int, input().split()))

big = array[0]
small = array[-1]
maxes = [0]*n
mins = [0]*n

for i in range (n):
	if array[i] > big:
		big = array[i]
	if array[n-i-1] < small:
		small = array[n-i-1]
	maxes[i] = big
	mins[n-i-1] = small

count = 0

for i in range (n):
	if array[i] >= maxes[i] and array[i] <= mins[i]:
		count += 1

print(count)
