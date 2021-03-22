a, b = map(int, input().split())
ships = sorted(list(map(int, input().split())))
count = 0
for i in ships:
    if b > i:
        count += 1
        b -= (i+1)
    if b <= 0:
        break
print(count)
