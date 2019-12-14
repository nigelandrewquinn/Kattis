n = int(input())
player = 1
prev = input()
seen = {prev}

for i in range(n-1):
    word = input()
    player+=1
    if player%2 == 0:
        player = 2
    else:
        player = 1

    if prev[-1] == word[0] and word not in seen: 
        prev = word
        seen.add(word)
    else:
        break

if len(seen) == n:
    print("Fair game")
else:
    print('Player', player, 'lost')