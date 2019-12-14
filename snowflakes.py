from sys import stdin, stdout

for _ in range(int(stdin.readline())):
    seen= set()
    count = 0
    longest = 0
    for i in range(int(stdin.readline())):
        sf = int(stdin.readline())
        if sf not in seen:
            seen.add(sf)
            count+=1
            longest = max(longest, count)
        else:
            count = 0
    print(longest)