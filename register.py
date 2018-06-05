v2,v3,v5,v7,v11,v13,v17,v19 = map(int, input().split())
#find max num each can hold 
ans = (18 - v19)*510510
ans += (16 - v17)*30030
ans += (12 - v13)*2310
ans += (10 - v11)*210
ans += (6 - v7)*30 #2*3*5
ans += (4 - v5)*6 #2*3
ans += (2 - v3)*2  
ans += (1 - v2) 
print(ans)
    
