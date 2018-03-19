import math
from sys import stdin, stdout 

f = {'1': 1, '2': 2, '6': 3, '24': 4, '120': 5, '720': 6, '5040': 7, '40320': 8, '362880': 9, '3628800': 10}
n = str(input())

if(n in f): 
    stdout.write(str(f[n]))       
else:
    l = len(n)
    x = 0
    for i in range(1,l*2):
        x += math.log10(i)
        if(x>l):
            stdout.write(str(i-1))
            break
  
#472001600
