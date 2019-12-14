from sys import stdin
n = stdin.readline()
l = list(map(int, stdin.readline().split()))
move = True
while move:
    move = False
    i = 0
    while i < len(l) - 1:
        if (l[i] + l[i+1]) % 2 == 0:
            l.pop(i)
            l.pop(i)
            move = True 
        else:
            i += 1

print(len(l))