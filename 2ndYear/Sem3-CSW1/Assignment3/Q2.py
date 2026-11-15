# Write a Python program that simulates a basic command-line calculator supporting multiple operations (addition, subtraction, multiplication, and division). The program should perform the following tasks:
# • Accept user inputs in the format: {operation num1 num2} (for example, add 5
# 3).
# • Support the following operations: add, sub, mul, div.
# • Provide an option to exit the program with the command exit.
# • Print the result of each calculation immediately after execution.
# Example Output:
# Enter operation (add/sub/mul/div) or ’exit’ to quit:
# add 5 3
# Result: 8
# div 10 0
# Error: Division by zero is not allowed.
# mul 4 6
# Result: 24
# exit
# Program terminated.

while True:
    s=input("Enter operation (add/sub/mul/div) or 'exit' to quit: ")
    if s=="exit":
        print("Program terminated.")
        break
    op,a,b=s.split()
    a,b=int(a),int(b)
    if op=="add":
        print("Result:",a+b)
    elif op=="sub":
        print("Result:",a-b)
    elif op=="mul":
        print("Result:",a*b)
    elif op=="div":
        if b==0:
            print("Error: Division by zero is not allowed.")
        else:
            print("Result:",a/b)
    else:
        print("Invalid Operation")