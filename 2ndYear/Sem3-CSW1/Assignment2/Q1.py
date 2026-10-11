# Write a Python program that stores the scores of students in a list and performs various operations on it. The program should accomplish the following tasks:
# i. Find and display the average score.
# ii. Determine the minimum and maximum scores.
# iii. Display all scores above the average.
# iv. Sort the list in descending order of scores.
# v. Replace the three lowest scores in the list with zero (0).

scores=[91,87,77,83,75,95]
avg=sum(scores)/len(scores)
print(f"Average: {int(avg)}")
print(f"Maximum: {max(scores)}, Minimum: {min(scores)}")
print(f"Scores above Average: {[s for s in scores if s>avg]}")
print(f"Descending Order: {sorted(scores,reverse=True)}")
scores[-3:]=[0,0,0]
print(f"Replacing 3 Lowest Scores: {scores}")