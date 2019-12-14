hm = {}
for i in range(int(input())):
    a, b = input().split()
    if a in hm:
        hm[a].append(int(b))
    else:
        hm[a] = [int(b)]

for i in hm:
    hm[i] = sorted(hm[i])

for i in range(int(input())):
    a, b = input().split()
    print(hm[a][int(b)-1])