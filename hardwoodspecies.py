import sys
lines = sys.stdin.readlines()
hm = {}
hs = set()
count = 0
for line in lines:
    if line in hm:
        
        hm[line]+=1
    else:
        hm[line] = 1
    count+=1
    hs.add(line)
ar = sorted(hs)
for i in range (len(ar)):
    print(ar[i], float(hm[ar[i]]/count*100))
