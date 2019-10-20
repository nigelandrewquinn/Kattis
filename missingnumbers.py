hs = set()
max = 0
for i in range(int(input())):
    n = int(input())
    if max < n:
        max = n
    hs.add(n)
if len(hs) == max:
    print('good job')
else:
    for i in range(1,max):
        if i not in hs:
            print(i)