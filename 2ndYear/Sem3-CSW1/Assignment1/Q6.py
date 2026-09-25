# Design and implement a Python program that performs both encryption and decryption of a string.
# The encryption function should first reverse the input string and then swap every
# adjacent pair of characters to generate the encrypted text. The decryption function
# should reverse this process to obtain the original string.
# Input: A string entered by the user (e.g., “hello”)
# Output: Display both the encrypted and decrypted strings.
# For example: Encrypted: loelh, Decrypted: hello

def encrypt(s):
    c=list(s[::-1])
    for i in range(0,len(c)-1,2):
        c[i],c[i+1]=c[i+1],c[i]
    return "".join(c)
def decrypt(s):
    c=list(s)
    for i in range(0,len(c)-1,2):
            c[i],c[i+1]=c[i+1],c[i]
    return ("".join(c))[::-1]
us=input("Enter a String: ")
print(f"Encrypted: {encrypt(us)}, Decrypted: {decrypt(encrypt(us))}")