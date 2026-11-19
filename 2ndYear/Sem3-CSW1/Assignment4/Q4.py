# Using re.search, find the first substring of two-or-more digits in a target string and
# print the matched text and its span (start,end) using the match object.
# Example Input: "1 set of 23 owls, 999 doves."
# Expected output printed:
# "23" found at (9, 11)
# (Use pattern \d{2,} and m.group() + m.span()).

import re
s="1 set of 23 owls, 999 doves."
m=re.search(r"\d{2,}",s)
if m:
    print(f'"{m.group()}" found at {m.span()}')