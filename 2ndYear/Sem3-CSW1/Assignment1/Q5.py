# Design and implement a Python program that reads a decimal number from the user
# and performs multiple base conversions. The program should:
# • Convert the decimal number into its Binary, Octal, and Hexadecimal representations using the built-in functions.
# • Display all three converted values without their prefixes (0b, 0o, 0x).
# • Count and display the number of digits in each converted representation.
# • Reverse the conversion — convert the binary, octal, and hexadecimal strings
# back to decimal using the int(string, base) function — and display the results to verify correctness.
# Input: A decimal number entered by the user (e.g., 255).
# Output: Display the binary, octal, and hexadecimal forms (without prefixes) and
# their digit counts. Then show the decimal values obtained by reconverting each representation.

n=int(input("Enter Decimal: "))
b=bin(n)[2:]
o=oct(n)[2:]
h=hex(n)[2:].upper()
bc=len(b)
oc=len(o)
hc=len(h)
rb=int(b,2)
ro=int(o,8)
rh=int(h,16)
print(f"Binary: {b}, Digits: {bc}")
print(f"Octal: {o}, Digits: {oc}")
print(f"Hexadecimal: {h}, Digits: {hc}")
print(f"From Binary: {rb}")
print(f"From Octal: {ro}")
print(f"From Hexadecimal: {rh}")