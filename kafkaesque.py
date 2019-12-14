max = 0
count = 1
for i in range(int(input())):
    x = int(input())
    if x < max: 
        count+=1
    max = x
print(count)



