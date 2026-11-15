# Write a Python function that can accept any number of sales amounts as positional
# arguments (*args) and additional information (such as the name of the salesperson,
# date, and location) as keyword arguments (**kwargs). The function should perform
# the following tasks:
# • Add up all the sales amounts provided through *args.
# • Count and display how many pieces of extra information were provided
# through **kwargs.
# Example Output:
# Total Sales Amount: 12500
# Number of Extra Information Items: 3
# Extra Information Provided:
# Name: John Doe
# Date: 2025-11-01
# Location: Bhubaneswar

def sales(*args,**kwargs):
    print(f"Total Sales Amount: {sum(args)}")
    print(f"Number of Extra Information Items: {len(kwargs)}")
    print("Extra Information Provided:")
    for k,v in kwargs.items():
        print(f"{k}: {v}")
sales(5000,3000,4500,Name="John Doe",Date="2025-11-01",Location="Bhubaneswar")