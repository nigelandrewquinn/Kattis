import re
a, b  = input().split()
if re.match(".*e$", a):
    print(''.join([a,'x',b]))
elif re.match(".*(a|i|o|u)$",a ):
    print(''.join([a[:-1],'ex',b]))
elif re.match(".*ex$",a ):
    print(''.join([a,b]))
else:
    print(''.join([a,'ex',b]))