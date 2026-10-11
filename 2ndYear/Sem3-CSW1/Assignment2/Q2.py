# Write a Python function that classifies integers in a given list according to a custom
# classification scheme. The function should divide numbers into meaningful categories and return the result as a dictionary, where the keys are category names and
# the values are lists of numbers belonging to those categories.
# Possible classification schemes include:
# • Prime Numbers
# • Composite Numbers
# • Perfect Squares
# • Perfect Cubes
# The function should process the input list, identify numbers belonging to each category, and display the resulting dictionary in a clear format.
# Input: A list of integers entered by the user (e.g., [2, 4, 8, 9, 27, 28]).
# Output: Display a dictionary showing the classification of numbers under different
# categories.
# Example Output:
# Input = [2, 4, 8, 9, 27, 28]
# Output = [
# ”Prime”: [2],
# ”Composite”: [4, 8, 9, 27, 28],
# ”Perfect Squares”: [4, 9],
# ”Perfect Cubes”: [8, 27]
# ]

import math
def classify(nums):
    res={"Prime":[],"Composite":[],"Perfect Squares":[],"Perfect Cubes":[]}
    for n in nums:
        if n>1:
            if all(n%i!=0 for i in range(2,int(math.sqrt(n))+1)):
                res["Prime"].append(n)
            else:
                res["Composite"].append(n)
        if n>=0 and int(math.sqrt(n))**2==n:
            res["Perfect Squares"].append(n)
        if n>=0 and round(n**(1/3))**3==n:
            res["Perfect Cubes"].append(n)
    return res
nums=[2,4,8,9,27,28]
print(classify(nums))