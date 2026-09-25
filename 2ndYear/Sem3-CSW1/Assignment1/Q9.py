para=input("Enter paragraph: ")
para=" ".join(para.split())
para=para.title()
count=[0,0,0,0,0]
for i in para:
    if ord(i.lower())==ord('a'):
        count[0]+=1
    elif ord(i.lower())==ord('e'):
        count[1]+=1
    elif ord(i.lower())==ord('i'):
        count[2]+=1
    elif ord(i.lower())==ord('o'):
        count[3]+=1
    elif ord(i.lower())==ord('u'):
        count[4]+=1
print("Processed Text:",para)
print("Vowels Count:")
print("A:",count[0],end=" ")
print("E:",count[1],end=" ")
print("I:",count[2],end=" ")
print("O:",count[3],end=" ")
print("U:",count[4],end=" ")