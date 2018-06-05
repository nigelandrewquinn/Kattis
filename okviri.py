s = input()

l1 = "."
l2 = "."
l3 = "#"
l4 = "."
l5 = "."

for i in range(len(s)):
    if (i+1) % 3 == 0 and i != 0:
        l1 += ".*.."
        l2 += "*.*."
        l3 += "*." + s[i] + ".*"
        l4 += "*.*."
        l5 += ".*.."

    else:
        l1 += ".#.."
        l2 += "#.#."
        if (i+2) % 3 == 0 and (i+1) in range(len(s)):
            l3 += "." + s[i] + "."
        else:
            l3 += "." + s[i] + ".#"
        l4 += "#.#."
        l5 += ".#.."

print(l1,"\n",l2,"\n",l3,"\n",l4,"\n",l5,"\n")
