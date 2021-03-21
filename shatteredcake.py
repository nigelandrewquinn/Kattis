w = int(input())
sum = 0
for i in range(int(input())):
    x, y = map(int, input().split())
    sum += x*y
print(int(sum/w))
