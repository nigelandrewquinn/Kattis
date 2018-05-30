ba, br, bs, aa, als = map(int,input().split())
bt = int(0)
at = int(0)
bt = bs*(br-ba)
while (at <= bt):
  at += als
  aa+=1
print(aa)
