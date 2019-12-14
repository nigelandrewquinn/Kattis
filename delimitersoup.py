  
n = int(input())
l = list(input())
stack = []
found = True
hls1,hls2 = '',0
for i in range(n):
    b= l[i]
    if b!=' ':
        if b in ')]}':
            if len(stack)==0 :
                print(b, i)
                found = False
                break
            if b == ')':
                if stack.pop(0) != '(' :
                    print(b,i)
                    found = False
                    break
            elif b ==']':
                if stack.pop(0) != '[' :
                    print(b, i)
                    found = False
                    break
            elif b =='}':
                if stack.pop(0) != '{' :
                    print(b, i)
                    found = False
                    break
        else :
            stack.insert(0,b)
if found:
    print("ok so far")