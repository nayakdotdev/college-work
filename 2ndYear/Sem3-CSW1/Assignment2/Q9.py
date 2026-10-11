# Write a Python program that checks voting eligibility using filter() and dictionary comprehension. The program should perform the following tasks:
# a) Use filter() to extract eligible voters (age ≥ 18 and nationality = ”Indian”).
# b) Count and display the total number of eligible voters.
# c) Build a dictionary using dictionary comprehension in the format
# {’Eligible’:[...], ’Not Eligible’:[...]}.
# Input: A list of tuples containing voter information — name, age,
# and nationality. (e.g., [(”Amit”,22,”Indian”), (”John”,30,”USA”),
# (”Neha”,17,”Indian”), (”Ravi”,19,”Indian”)])
# Output: Eligible: [”Amit”, ”Ravi”]
# Count: 2
# {’Eligible’: [’Amit’, ’Ravi’], ’Not Eligible’: [’John’, ’Neha’]}

voters=[("Amit",22,"Indian"),("John",30,"USA"),("Neha",17,"Indian"),("Ravi",19,"Indian")]
eligible=list(filter(lambda v:v[1]>=18 and v[2]=="Indian",voters))
names=[v[0] for v in eligible]
res={"Eligible":[v[0] for v in voters if v in eligible],
     "Not Eligible":[v[0] for v in voters if v not in eligible]}
print(f"Eligible: {names}")
print(f"Count: {len(names)}")
print(res)