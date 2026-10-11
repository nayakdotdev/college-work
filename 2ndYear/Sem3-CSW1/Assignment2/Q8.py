# Description: Write a Python program to process a list of email-like strings using
# functional programming tools. The program should perform the following tasks:
# a) Use filter() with a lambda function to extract only valid emails (those that
# contain @ and end with .com or .org).
# b) Use list comprehension to extract the domain names from the valid emails.
# c) Construct a dictionary where each key is a domain name and each value is its
# frequency count.
# Input: A list of email-like strings (e.g., [”test@gmail.com”, ”hello123”,
# ”abc.org”, ”world@yahoo.com”]).
# Example Output:
# Valid Emails: [”test@gmail.com”, ”world@yahoo.com”]
# Domains: [”gmail”, ”yahoo”]
# Domain Frequency: ”gmail”: 1, ”yahoo”: 1

emails=["test@gmail.com","hello123","abc.org","world@yahoo.com"]
valid=list(filter(lambda e:"@" in e and e.endswith((".com",".org")),emails))
domains=[e.split("@")[1].split(".")[0] for e in valid]
freq={d:domains.count(d) for d in domains}
print(f"Valid Emails: {valid}")
print(f"Domains: {domains}")
print(f"Domain Frequency: {freq}")