while 1:
	try:
	    l = input().split()
	    t = list(map(int, l[3].split(":")))
	    tt = list(map(int, l[4].split(":")))
	    if tt[1] == t[1]:
	        l[3] = "{} hours".format(tt[0]-t[0])
	        l[4] = "0 minutes"
	    elif tt[1] >= t[1]:
	        l[3] = "{} hours".format(tt[0]-t[0])
	        l[4] = "{} minutes".format(tt[1]-t[1])
	    else:
	        t1 = t[1]-tt[1]
	        l[3] = "{} hours".format(tt[0]-t[0]-1)
	        l[4] = "{} minutes".format(60 - t1)
	    print(" ".join(l))

	except EOFError:
		break
