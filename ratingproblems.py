n, k = map(int, input().split())
total = 0
left = n-k
for i in range(k):
    total += int(input())
t_low = (left*(-3)+total)/n
t_high = (left*(3)+total)/n
print(t_low, t_high)
