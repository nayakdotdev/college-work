# Write a Python program that demonstrates the use of set comprehension, dictionary comprehension, and lambda function with sorting. The program should perform the following tasks:
# a) Accept a list of integers with duplicate values.
# b) Remove duplicates using set comprehension.
# c) Construct a frequency dictionary using dictionary comprehension.
# d) Sort the numbers in descending order of frequency using the sorted() function with a lambda expression.
# Input: A list of integers with duplicates (e.g., [4, 2, 7, 4, 2, 4, 9, 7, 9, 9]).
# Output: Display the unique numbers, frequency dictionary, and numbers sorted list
# by descending frequency.

nums=[4,2,7,4,2,4,9,7,9,9]
unique={n for n in nums}
freq={n:nums.count(n) for n in unique}
sorted_nums=sorted(unique,key=lambda n:freq[n],reverse=True)
print(f"Unique Numbers: {unique}")
print(f"Frequency Dictionary: {freq}")
print(f"Sorted by Frequency: {sorted_nums}")