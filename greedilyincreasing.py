input()
a = list(map(int, input().split()))
l = []
temp = int(0)
for i in range (len(a)):
  if a[i] > temp:
    temp = a[i]
    l.append(a[i])
print(len(l))
for p in l: print (p," ", end="")   
