# Write a Python function that takes a dictionary containing student names as keys
# and their list of scores (integers) as values. The function should calculate the average score for each student and return the name of the student who has the highest
# average score.
# Input: A dictionary where each key is a student’s name and each value is a list of
# integer scores. (e.g., students scores = {”Ram”: [85, 90, 92], ”Laxman”:
# [70, 80, 88], ”Janaki”: [95, 100, 90]})
# Output: Display the name of the student with the highest average score.

def highest_avg(students):
    avg={name:sum(scores)/len(scores) for name,scores in students.items()}
    return max(avg,key=avg.get)
students={"Ram":[85,90,92],"Laxman":[70,80,88],"Janaki":[95,100,90]}
print("Student with Highest Average:",highest_avg(students))