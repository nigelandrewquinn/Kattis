low = 1
high = 10
while 1:
    honest = True
    n = int(input())
    if n == 0: break
    l = input()

    if l == 'too high' and n <= high:
        high = n - 1
    
    if l == 'too low' and n >= low:
        low = n + 1

    if l == 'right on':

        if n > high or n < low:
            honest = False   

        if honest:
            print('Stan may be honest')
        else:
            print('Stan is dishonest')
        low = 1
        high = 10             
