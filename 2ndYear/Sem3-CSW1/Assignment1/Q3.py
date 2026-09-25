# Design and implement a Python program that accepts the name of a month from the
# user as a string input. The program should determine and display the number of days
# in the specified month. For February, the program should identify the year (leap or
# non-leap year) first, before determining the number of days (28 or 29 days).
# Make use of Dictionary data structures for mapping months to their corresponding
# number of days. Handle both valid and invalid inputs by displaying an error message
# if the entered month name is incorrect.
# Input:
# Enter the name of a month: February
# Enter a year: 2024
# Output:
# February 2024 has 29 days.

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