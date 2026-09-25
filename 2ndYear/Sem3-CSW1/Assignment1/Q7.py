sen=input("Enter Sentence: ")
sep=input("Enter Sequence: ")
words=sen.split()
valid=[]
for i in words:
    i=i.strip(".,!?;:'\"-()[]{}")
    if i:
        valid.append(i.lower())
valid.sort(reverse=True)
print(sep.join(valid))