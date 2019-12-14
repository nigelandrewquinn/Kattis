def check(s): 
    brackets = ['$b', '|t', '*j'] 
    while any(x in s for x in brackets): 
        for i in brackets: 
            s = s.replace(i, '') 
    return not s 

for i in range(int(input())): 
    print('YES' if check(input().replace('.','')) else "NO") 