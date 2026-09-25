dict={'January':31,'February':28,'March':31,'April':30,'May':31,
      'June':30,'July':31,'August':31,'September':30,'October':31,
      'November':30,'December':31}
m=input("Enter name of month: ")
if m not in dict:
    print(f"{m} not Valid Input!")
elif m=="February":
    y=int(input("Enter year: "))
    if y%4==0 and (y%100!=0 or y%400==0):
        print(f"{m} has 29 Days")
    else:
        print(f"{m} has {dict[m]} Days")
else:
    print(f"{m} has {dict[m]} Days")