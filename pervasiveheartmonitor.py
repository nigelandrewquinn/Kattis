import re
while 1:
	try:
		l = input().split()
		words = []
		sum = 0.0
		for i in range(len(l)):
			if re.match(r"\d+", l[i]):
				sum += float(l[i])
			else:
			 words.append(l[i])
		print(sum/(len(l)-len(words)), " ".join(list(words)))	 

	except EOFError:
		break		

