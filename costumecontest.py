d = {}
max = 100000000
costume = []
for i in range(int(input())):
    s = input()
    if s in d:
        d[s]+=1
    else:
        d[s] = 1
for i in d:
    if d[i] < max:
        max = d[i]
        costume = [i]
    elif max == d[i]:
        costume.append(i)

costume.sort()
for i in costume:
    print(i)
