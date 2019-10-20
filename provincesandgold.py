D1 = {'Province' : 8, 'Duchy': 5, 'Estate' : 2}
D2 = {'Gold' : [6,3], 'Silver' : [3,2], 'Copper' : [0,1]}
G, S, C = map(int, input().split())
Total = 0
Total += D2['Gold'][1]*G
Total += D2['Silver'][1]*S
Total += D2['Copper'][1]*C
a1 = ''
a2 = ''
if D1['Province'] <= Total:
    a1 = 'Province' 
elif D1['Duchy'] <= Total:
    a1 = 'Duchy'
elif D1['Estate'] <= Total:
    a1 = 'Estate'
if D2['Gold'][0] <= Total:
    a2 = 'Gold' 
elif D2['Silver'][0] <= Total:
    a2 = 'Silver'
elif D2['Copper'][0] <= Total:
    a2 = 'Copper'
if a1 and a2:
    print(a1, 'or', a2)
else:
    print(a1 if a1 else a2)

