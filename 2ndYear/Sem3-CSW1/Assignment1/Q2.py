# Design and implement a Python program that simulates a simple calculator using
# if-elif statements.
# The program should allow the user to choose an operation :— addition, subtraction,
# multiplication, division, or modulus and then input two numbers.
# The program should perform the selected arithmetic operation based on the user’s
# choice and display the result in a clear and readable format.
# It should also handle division and modulus by zero using conditional checks and
# display an appropriate warning message.
# Input: Operation choice (add, sub, mul, div, mod) and two numbers entered by the
# user.
# Output: Display the result of the chosen operation or show a warning message if
# division or modulus by zero is attempted.
# Example: Enter operation (add/sub/mul/div/mod): div
# Enter first number: 10
# Enter second number: 0
# Error: Division by zero not allowed.

op=input("Enter operation (add/sub/mul/div/mod): ")
if op=='add' or op=='sub' or op=='mul' or op=='div' or op=='mod':
    x=int(input("Enter first number: "))
    y=int(input("Enter second number: "))
    if op=='add':
        print(f"{x}+{y}={x+y}")
    elif op=='sub':
        print(f"{x}-{y}={x-y}")
    elif op=='mul':
        print(f"{x}x{y}={x*y}")
    elif op=='div':
        if y==0:
            print("Error: Division by Zero not Allowed")
        else:
            print(f"{x}/{y}={x/y}")
    elif op=='mod':
        if y==0:
            print("Error: Division by Zero not Allowed")
        else:
            print(f"{x}%{y}={x%y}")