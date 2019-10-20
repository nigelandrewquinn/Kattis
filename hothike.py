n = int(input())
l = list(map(int, input().split()))
ans = 0
min = max(l[0], l[2])
for i in range(n-2):
    if max(l[i],l[i+2]) < min:
        min = max(l[i],l[i+2])
        ans = i
print(ans+1, min)