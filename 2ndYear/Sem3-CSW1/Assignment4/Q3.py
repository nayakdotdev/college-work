# Write normalize_phones(s) that takes a string with phone numbers in inconsistent
# formats and returns a string where all numbers are normalized to +91-
# XXXXXXXXXX. Accept examples like +91-9876543210, (91) 98765 43210, 0091
# 9876543210, 91 9876543210. Use character sets, \s, optional groups (?) and
# quantifiers — do not use numeric-range parsing beyond regex.
# Input:
# "Contact: +91-9876543210, Office: (91) 98765 43210, Home: 0091 9876543210"
# Output:
# "Contact: +91-9876543210, Office: +91-9876543210, Home: +91-9876543210"

import re
def normalize_phones(s):
    pattern=r"(?:\+91[-\s]*|\(91\)\s*|0091\s*|91\s*)([0-9]{5})\s*([0-9]{5})"
    return re.sub(pattern,r"+91-\1\2",s)
s="Contact: +91-9876543210, Office: (91) 98765 43210, Home: 0091 9876543210"
print(normalize_phones(s))