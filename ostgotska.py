import re
s = input().split(" ")
count = int(0)
for i in range (len(s)):
  match = re.search(r'ae', s[i])
  if match:
    count+=1
if (count/len(s)) >= 0.4 :
  print("dae ae ju traeligt va")
else:
  print("haer talar vi rikssvenska")  
 
