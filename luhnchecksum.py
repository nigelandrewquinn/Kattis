for i in range(int(input())): s = list(map(int, (list(input()))))[::-1] ; print('PASS' if (sum(s[0::2]) + sum (map(lambda x: 2*x if 2*x <=9 else 2*x-9, s[1::2]))) %10 == 0 else 'FAIL') #thanks Peter
