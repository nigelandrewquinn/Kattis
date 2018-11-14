students, throws = map(int,input().split())
instructions = input().split()
l = []
i= 0
while i < len(instructions):
	if instructions[i] == 'undo':
		i+=1
		for j in range(int(instructions[i])) :
			l.pop()
		i+=1
	else:
		l.append(int(instructions[i]))
		i+=1
print(sum(l)%students)
