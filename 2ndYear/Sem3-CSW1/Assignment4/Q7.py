# Given the text:
# "Random <tag>first</tag> some text <tag>second</tag> end"
# (a) Write a regex using a quantifier that will match from the first <tag> to the final
# </tag> (show what is matched).
# (b) Then write a regex using a quantifier so you capture each tag pair separately (show
# both matches).

import re
s="Random <tag>first</tag> some text <tag>second</tag> end"
m=re.search(r"<tag>.*</tag>",s)
print("Greedy Match:",m.group())
matches=re.findall(r"<tag>.*?</tag>",s)
print("Separate Matches:",matches)