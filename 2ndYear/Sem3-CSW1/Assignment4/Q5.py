# Write a function that, given a word, returns True if it matches the pattern: starts with
# c, then a vowel (a,e,i,o,u), then any single consonant, using appropriate character
# sets and ranges. For example cat, cit, cot, cut should match; caa should not (because
# third char must be consonant).

import re
def check_word(word):
    return bool(re.fullmatch(r"c[aeiou][b-df-hj-np-tv-z]",word))
words=["cat","cit","cot","cut","caa"]
for w in words:
    print(w,":",check_word(w))