# The student information is stored using a combination of different Python data structures:
# • List – contains marks of students in different subjects.
# • Tuple – stores a student’s information such as (ID, Name).
# • Set – keeps track of unique skills a student has (e.g., ”Python”, ”Java”, ”C”,
# ”C#”, ”C++”).
# • Dictionary – represents a full student profile with keys like ”info”, ”marks”,
# and ”skills”.
# You are given a list of such student profiles (each represented as a dictionary). Write
# a Python function that processes this data and performs the following tasks:
# • Calculate and display the average marks of each student.
# • Count the total occurrences of each skill across all students (e.g., how many
# students know Python, Java, etc.).
# • Identify and display the top-performing student based on average marks.
# Input: A list of student profiles represented as dictionaries, each containing ”info”,
# ”marks”, and ”skills”.
# Output: Display the average marks of each student, the overall skill frequency, and
# the name of the top-performing student.

def process(students):
    freq={}
    avg={}
    for s in students:
        name=s["info"][1]
        avg[name]=sum(s["marks"])/len(s["marks"])
        for skill in s["skills"]:
            freq[skill]=freq.get(skill,0)+1
    for name,a in avg.items():
        print(f"Average of {name}: {a:.2f}")
    print(f"Skill Frequency: {freq}")
    print(f"Top Performer: {max(avg,key=avg.get)}")
students=[
    {"info":(1,"Amit"),"marks":[85,90,92],"skills":{"Python","Java"}},
    {"info":(2,"Neha"),"marks":[95,100,90],"skills":{"Python","C++"}},
    {"info":(3,"Ravi"),"marks":[70,80,88],"skills":{"Java","C"}}
]
process(students)