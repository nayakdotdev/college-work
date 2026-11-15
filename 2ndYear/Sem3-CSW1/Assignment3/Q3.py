# Create a Python program that demonstrates advanced tuple assignment with multiple features. The program should perform the following tasks:
# • Prompt the user to enter a list of integers separated by spaces.
# • Use tuple unpacking to extract the first two numbers as individual variables
# and the rest into a list using the starred expression.
# • Swap the first two numbers using tuple assignment.
# • Compute and print the sum of the remaining numbers.
# • Demonstrate unpacking where the starred variable appears in the middle (e.g.,
# first, middle, last) and display the values assigned.
# Example Output:
# Enter integers separated by spaces: 10 20 30 40 50
# First number: 10
# Second number: 20
# Remaining numbers: [30, 40, 50]
# After swapping: First: 20, Second: 10
# Sum of remaining numbers: 120
# Unpacking Example:
# First: 10
# Middle: [20, 30, 40]
# Last: 50

nums=list(map(int,input("Enter integers separated by spaces: ").split()))
first,second,*remaining=nums
print(f"First number: {first}")
print(f"Second number: {second}")
print(f"Remaining numbers: {remaining}")
first,second=second,first
print(f"After swapping: First: {first}, Second: {second}")
print(f"Sum of remaining numbers: {sum(remaining)}")
first,*middle,last=nums
print("Unpacking Example:")
print(f"First: {first}")
print(f"Middle: {middle}")
print(f"Last: {last}")