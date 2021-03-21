nums = input()


while 1:
    n = 1
    for i in nums:
        if int(i) > 0:
            n *= int(i)
    if n < 10:
        print(n)
        break
    nums = str(n)
