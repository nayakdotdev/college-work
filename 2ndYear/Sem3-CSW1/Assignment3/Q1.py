# Write a Python program that demonstrates the use of multiple assignment and tuple unpacking shortcuts. The program should perform the following tasks:
# • Prompt the user to enter three numbers separated by spaces.
# • Use a single-line assignment to store each number in its own variable (x, y, z).
# • Swap the values of y and z in one line using tuple unpacking.
# • Print the values of x, y, and z before and after the swap to show the effect of
# the shortcut.
# Example Output:
# User input: 5 6 7
# Before swapping: x = 5, y = 6, z = 7
# After swapping: x = 5, y = 7, z = 6

x,y,z=map(int,input("Enter 3 numbers: ").split())
print(f"Before swapping: x = {x}, y = {y}, z = {z}")
y,z=z,y
print(f"After swapping: x = {x}, y = {y}, z = {z}")