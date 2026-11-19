# Write a Python function verify_passwd(s) that validates a password using regular
# expressions based on the following rules:
# 1. The password must be at least 8 characters long.
# 2. It may contain letters, digits, or the special characters: @ # $ % ^ & * !
# 3. It must contain at least one digit.
# 4. It must contain at least one letter (uppercase or lowercase).
# 5. It must contain at least one special character from the above set.
# Use four separate regex patterns and combine them using logical and, similar to the
# example shown below.
# After defining the function, test it using the following inputs and print whether each
# password is valid (True) or invalid (False):

import re
def verify_passwd(s):
    p1=r".{8,}"
    p2=r"^[a-zA-Z0-9@#$%^&*!]+$"
    p3=r"[0-9]"
    p4=r"[a-zA-Z]"
    p5=r"[@#$%^&*!]"
    return bool(re.search(p1,s) and re.search(p2,s) and re.search(p3,s) and re.search(p4,s) and re.search(p5,s))
passwords=["Abc@1234","password","Hello@123","12345678","Test#2026"]
for p in passwords:
    print(p,":",verify_passwd(p))