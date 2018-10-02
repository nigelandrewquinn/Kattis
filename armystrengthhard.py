for t in range(int(input())):
    input()
    input()
    mG = max(map( int, input().split()))
    mM = max(map( int, input().split()))
    print ("MechaGodzilla" if mM > mG else "Godzilla")
