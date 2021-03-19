for _ in range(int(input())):
    a, b = map(int, input().split())
    l = []

    for i in range(a):
        l.append(list(input()))
    ans = ''
    
    for i in range(b):
        zeroes = ones = 0
        for j in range(a):
            if l[j][i] == '0':
                zeroes += 1
            else:
                ones += 1
        if zeroes > ones:
            ans += '0'
        else:
            ans += '1'
    
    print(ans)
            

