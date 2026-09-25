# Design and implement a Python program for two approaches for checking whether
# a given string is a palindrome using two separate functions.
# The first function should use a for loop to determine whether the given string is
# a palindrome. It should ignore only case differences (for example, “Madam” and
# “madam” should be treated as the same).
# The second function should use the two-pointer technique to check whether a
# string is a palindrome. This function should ignore case, spaces, and punctuation
# so that complete sentences such as “A man, a plan, a canal: Panama” can be correctly
# identified as palindromes.
# Finally, call both functions in the main program using the user input and display the
# results from both approaches for comparison.
# Input: A string entered by the user (e.g., “Madam”)
# Output: Display the results from both palindrome-checking functions. For example:
# For-loop Check: Palindrome, Two-pointer Check: Palindrome

def isPalinFor(s):
    sc=s.lower()
    n=len(sc)
    for i in range(n//2):
        if sc[i]!=sc[n-1-i]:
            print("Not Palindrome")
            return
    print("Palindrome")
def isPalinTwoPtr(s):
    l=0
    r=len(s)-1
    while l<r:
        if not s[l].isalnum():
            l=l+1
        elif not s[r].isalnum():
            r=r-1
        else:
            if s[l].lower()!=s[r].lower():
                print("Not Palindrome")
                return
            l=l+1
            r=r-1
    print("Palindrome")
us=input("Enter a String: ")
print("For-Loop Check:",end=" ")
isPalinFor(us)
print("Two-Pointer Check:",end=" ")
isPalinTwoPtr(us)