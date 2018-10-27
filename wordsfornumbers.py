import sys
import re
ztn = {0 : "zero", 1 : "one", 2 : "two", 3 : "three", 4 : "four", 5 : "five", 6 : "six", 7 : "seven", 8 : "eight", 9 : "nine"}
tens = {2 : "twenty", 3 : "thirty", 4 : "forty", 5 : "fifty", 6 : "sixty", 7 : "seventy", 8 : "eighty", 9 : "ninety"}
teens = {10 : "ten", 11 : "eleven", 12 : "twelve", 13 : "thirteen", 14 : "fourteen", 15 : "fifteen", 16 : "sixteen", 17 : "seventeen", 18 : "eighteen", 19 : "nineteen" }
lines = sys.stdin.readlines()
for line in lines:
	words = line.split()
	s = ''
	for i in range (len(words)):
		if re.match(r'\d',words[i]):

			t = int(words[i])
			if t < 10:
				s+= ztn[t] + ' ' 
			elif t > 9 and t < 20:
				s += teens[t] + ' '
			else:
				num = str(words[i])
				x = int(num[0])
				y = int(num[1])
				if y == 0:
					s += tens[x] + ' '
				else:
					s += tens[x] + '-' + ztn[y] + ' '
		else:
			s += words[i] + ' '
	cap = s[0].upper()
	s = cap + s[1:]		
	print(s)   
			
