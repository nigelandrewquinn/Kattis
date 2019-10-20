def main():
    for _ in range(int(input())):
        n = list(input())
        for i in range(len(n) - 1, -1, -1):
            if n[i] != '0':
                n[i] = str(int(n[i]) - 1)
                break
        print(int(''.join(n)))
    

if __name__ == "__main__":
    main()