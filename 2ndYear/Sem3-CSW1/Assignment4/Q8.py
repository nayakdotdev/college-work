# Write extract_date_parts(s) that uses a regex with three groups to parse a date of
# form DD-MM-YYYY (digits). If found, return a tuple: (whole_match, day, month,
# year, span_of_whole_match, lastindex). Use re.search and the match object's
# methods (group(0), group(1), group(2), group(3), span(), lastindex) to build
# the tuple.
# L2, L3
# Example: input "Backup 05-11-2025 complete" → output ('05-11-2025',
# '05', '11', '2025', (7,17), 3)

import re
def extract_date_parts(s):
    m=re.search(r"(\d{2})-(\d{2})-(\d{4})",s)
    if m:
        return (m.group(0),m.group(1),m.group(2),m.group(3),m.span(),m.lastindex)
    return None
s="Today's date is 19-11-2026"
print(extract_date_parts(s))