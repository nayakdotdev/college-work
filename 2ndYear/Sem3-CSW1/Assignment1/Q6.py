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