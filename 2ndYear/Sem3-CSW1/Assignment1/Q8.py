# Design and implement a Python function named validate password(password)
# that checks whether a given password meets specific security requirements. The
# function should validate the password based on the following rules:
# • The password must contain at least 8 characters.
# • It must include at least one uppercase letter (A–Z).
# • It must include at least one lowercase letter (a–z).
# • It must include at least one digit (0–9).
# • It must include at least one special character from the set !@#$% and no whitespaces.
# The function should return:
# • True if the password satisfies all the above conditions.
# • False, along with a list of specific error messages, if one or more rules are violated.
# Input: A string representing the password entered by the user (e.g., “Pass@123”).
# Output: Display whether the password is valid or invalid, and if invalid, list the violated rules.

def validate_password(ps):
    err=[]
    if len(ps)<8:
        err.append("Password must contain at least 8 characters")
    upp=False
    low=False
    dig=False
    sch=False
    wsp=False
    for i in ps:
        if i.isupper():
            upp=True
        elif i.islower():
            low=True
        elif i.isdigit():
            dig=True
        elif i.isspace():
            wsp=True
        elif i=='!' or i=='@' or i=='#' or i=='$' or i=='%':
            sch=True
    if not upp:
        err.append("Password must include at least one uppercase letter (A-Z)") 
    if not low:
        err.append("Password must include at least one lowercase letter (a-z)") 
    if not dig:
        err.append("Password must include at least one digit (0-9)") 
    if not sch:
        err.append("Password must include at least one special character from the set !@#$%") 
    if wsp:
        err.append("Password must not include whitespaces") 
    if len(err)==0:
        return True,[]
    else:
        return False,err
ups=input("Enter Password: ")
v,e=validate_password(ups)
if v:
    print("Password is Valid!")
else:
    print("Password is Invalid!")
    print("Errors:")
    for i in e:
        print("-",i)