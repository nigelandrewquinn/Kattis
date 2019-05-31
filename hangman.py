word = set(input())
guess = input()

wrong = 0
for i in guess:
    if len(word) == 0:
        print("WIN")
        break
    if wrong == 10:
        print("LOSE")
        break
    if i in word:
        word.discard(i)
    else:
        wrong += 1
