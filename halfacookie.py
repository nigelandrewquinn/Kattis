import math
l = input()
while l:
    try:
        r,x,y = map(float, l.split())
        area = math.pi*r**2
        d = math.sqrt(x**2 + y**2)
        if d > r:
            print("miss")
        else:
        #are of sector - area of triangle
        #area of circle - area of segment
            tmp = r-d
            o = 2*math.acos(d/r)
            seg = 0.5*(o - math.sin(o))*(r**2)
            print(area - seg,seg)

        l = input() 

    except EOFError:
        break
