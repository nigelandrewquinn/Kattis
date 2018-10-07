n = int(input())
l = input().split()
ans = 'makes sense'
for i in range (n):
	if l[i] != str((i+1)) and l[i] != 'mumble':
		ans = 'something is fishy'
print(ans)		
