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