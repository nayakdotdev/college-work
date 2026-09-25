# Develop a Python program that counts the frequency of each word in a given sentence while ignoring case and punctuation.
# The program should process the sentence, remove punctuation marks, convert all
# words to lowercase, and then count how many times each unique word appears.
# Finally, display the word frequencies in a formatted string sorted alphabetically by
# word.
# Input: A sentence entered by the user (e.g., “Hello world, hello!”).
# Output: Display the sorted word frequencies in the format “word: count“.
# For example: hello: 2 world: 1

sen=input("Enter Sentence: ")
sen=sen.lower()
for i in ".,!?;:'\"-()[]{}":
    sen=sen.replace(i,"")
w=sen.split()
f={}
for wd in w:
    if wd in f:
        f[wd]+=1
    else:
        f[wd]=1
w=sorted(f)
for i in w:
    print(f"{i}: {f[i]}")