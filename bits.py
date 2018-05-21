n = int(input())
while n > 0:
    x = input()
    ans = 0
    for i in range(1, len(x) + 1):
        temp = int(x[:i])
        current = bin(temp).count('1')
        if current > ans:
          ans = current
    print (ans)
    n-=1
