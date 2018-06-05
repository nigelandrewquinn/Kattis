ar = list(map(int, input().split()))
t1 = ar[6]
t2 = ar[7]
ar = ar[:-2]
i = 0
while i < len(ar):
    j = 0
    while j < len(ar):
        k = 0
        while k < len(ar):
            if i != j and j != k and i != k and ar[i] + ar[j] + ar[k] == t1:
                arr = [ar[i], ar[j], ar[k]]
                ar.remove(arr[0])
                ar.remove(arr[1])
                ar.remove(arr[2])
            k+=1
        j+=1
    i+=1
arr.sort(reverse=True)
ar.sort(reverse=True)
for p in arr: print (p," ", end="") 
for p in ar: print (p," ", end="") 

