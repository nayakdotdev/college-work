# Develop a Python program that reads a sentence from the user, splits it into words,
# sorts them in reverse alphabetical order, and joins them using a custom separator
# provided by the user.
# The program should ignore punctuation marks during processing so that only valid
# words are considered for sorting.
# Input: A sentence and a custom separator entered by the user (e.g., “Hello, world!
# Python.”, “—”).
# Output: Display the sorted words joined by the specified separator.
# For example: world—python—hello

sen=input("Enter Sentence: ")
sep=input("Enter Sequence: ")
words=sen.split()
valid=[]
for i in words:
    i=i.strip(".,!?;:'\"-()[]{}")
    if i:
        valid.append(i.lower())
valid.sort(reverse=True)
print(sep.join(valid))