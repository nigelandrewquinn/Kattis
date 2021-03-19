s = input()
s = s[0] + s[1:len(s)-1] + s[1:len(s)-1] + s[len(s)-1]
print(s)
