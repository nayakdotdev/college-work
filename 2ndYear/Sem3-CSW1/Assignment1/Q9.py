# Develop a Python program that processes a paragraph of text entered by the user.
# The program should perform the following tasks:
# • Convert the entire paragraph into title case (each word starts with a capital
# letter).
# • Remove extra spaces between words using the split() and join() methods.
# • Count and display the occurrences of each vowel (A, E, I, O, U) using their character codes.
# Input: A paragraph entered by the user (e.g., “ this is an example paragraph ”).
# Output: Display the cleaned and title-cased paragraph, followed by the count of each
# vowel.
# For example: Processed Text: This Is An Example Paragraph
# Vowel Counts  A: 3, E: 2, I: 1, O: 0, U: 0

para=input("Enter paragraph: ")
para=" ".join(para.split())
para=para.title()
count=[0,0,0,0,0]
for i in para:
    if ord(i.lower())==ord('a'):
        count[0]+=1
    elif ord(i.lower())==ord('e'):
        count[1]+=1
    elif ord(i.lower())==ord('i'):
        count[2]+=1
    elif ord(i.lower())==ord('o'):
        count[3]+=1
    elif ord(i.lower())==ord('u'):
        count[4]+=1
print("Processed Text:",para)
print("Vowels Count:")
print("A:",count[0],end=" ")
print("E:",count[1],end=" ")
print("I:",count[2],end=" ")
print("O:",count[3],end=" ")
print("U:",count[4],end=" ")