# Write a Python function find_repeated_letters(s) that finds all occurrences
# where the same letter appears twice or more in a row (like aa, bbb, zzzz).
# Use:
# • a capturing group for the letter: (.)
# • a quantifier referencing the same letter: \1+
# • re.finditer() to retrieve all match objects
# • For each match object, print:
#   o the repeated sequence (group(0))
#   o the repeated character (group(1))
#   o the span (span())

import re
def find_repeated_letters(s):
    for m in re.finditer(r"(.)\1+",s):
        print(f"Sequence: {m.group(0)}")
        print(f"Character: {m.group(1)}")
        print(f"Span: {m.span()}")
s="baalloooon zzzz apple"
find_repeated_letters(s)