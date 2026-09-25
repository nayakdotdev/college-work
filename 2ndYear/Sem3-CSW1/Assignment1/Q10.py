sen=input("Enter Sentence: ")
sen=sen.lower()
for i in ".,!?;:'\"-()[]{}":
    sen=sen.replace(i,"")
w=sen.split()
f={}
for wd in w:
    if wd in f:
        f[wd]+=1
    else:
        f[wd]=1
w=sorted(f)
for i in w:
    print(f"{i}: {f[i]}")