# Write a regex that matches any string that begins with one or more lowercase letters (a–z),
# followed by one or more digits (0–9), and nothing else (^...$). Provide a short Python
# snippet to test several example strings and list which pass.
# Examples: abc123 → pass, a1b2 → fail, ABC123 → fail (uppercase not allowed by pattern).

import re
pattern=r"^[a-z]+[0-9]+$"
strings=["abc123","a1b2","ABC123","hello45","test"]
for s in strings:
    print(s,":","Pass" if re.fullmatch(pattern,s) else "Fail")