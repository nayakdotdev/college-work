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