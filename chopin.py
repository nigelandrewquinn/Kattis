notes = {"A#":"Bb", "Bb":"A#", "C#": "Db", "Db":"C#", "D#": "Eb", "Eb":"D#", "F#": "Gb", "Gb": "F#","G#":"Ab", "Ab": "G#"}
i = 0
while 1:
	try:
		i+=1
		l = input().split()
		if l[0] in notes:
			print('Case {}: {} {}'.format(i, notes[l[0]], l[1]))
		else:
			print('Case {}: {} '.format(i, 'UNIQUE'))

	except EOFError:
		break
