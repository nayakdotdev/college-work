# Write a Python script that takes several numbers as command-line arguments and
# prints their sum.
# • Use sys.argv to access the numbers from the command line.
# • Ensure the script ignores the filename while calculating the sum.
# • Display a clear error message if any argument is not a valid number.
# • Show a sample command-line usage and the expected output.
# Example Output:
# Command:
# python sumargs.py 10 20 30 40
# Output:
# Sum of numbers: 100
# Command:
# python sumargs.py 10 20 abc 30
# Error: Invalid input ’abc’. Please enter only numbers.

import sys
nums=sys.argv[1:]
total=0
for n in nums:
    try:
        total+=float(n)
    except ValueError:
        print(f"Error: Invalid input '{n}'. Please enter only numbers.")
        break
else:
    print(f"Sum of numbers: {total:g}")