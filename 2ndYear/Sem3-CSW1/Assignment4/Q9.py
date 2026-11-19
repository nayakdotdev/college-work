# Write a small function that uses re.search to locate the first substring that is an
# uppercase letter followed somewhere after it by a digit (the digit does not need to be
# immediately adjacent). Return the matched substring of the uppercase letter (i.e.,
# group(0) or appropriate capture) and position. Use a concise pattern that uses .* and
# capture the uppercase letter as a group.
# Example: "a B blah 9" → match uppercase B, and its index.

import re
def find_match(s):
    m=re.search(r"([A-Z]).*\d",s)
    if m:
        return (m.group(1),m.start(1))
    return None
s="a B blah 9"
print(find_match(s))