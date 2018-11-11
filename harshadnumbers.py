def sum_digits(num):
    num = str(num)
    digitSum = 0
    for i in num:
        digitSum += int(i)
    return digitSum

n = int(input())
while 1:
	if n%sum_digits(n)==0:
		print(n)
		break
	else: n+=1
