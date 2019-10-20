import re

flag = True
s = ''
for i in range(1,6):
    if re.match('.*FBI.*', input()):
        s += str(i) + ' '
        flag = False
if flag:
    print('HE GOT AWAY!')
else:
    for i in s:
        print(i, end = '')
