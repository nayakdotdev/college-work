# Write a Python function filter_emails(lst) that takes a list of strings and returns only
# those strings that look like a simple email according to this simplified rule:
# • username: starts with a letter or digit, may contain letters, digits, dot (.) or
# underscore (_) afterwards
# • exactly one @
# • domain: letters only (a–z or A–Z) followed by a dot and a 2–4 letter TLD (e.g.
# edu, com, in)
# Input:
# ["student123@gmail.com", "teacher.name@soa.edu", "abc.xyz@abc.in",
# "xyz#12@abc.com", "bad@1n.com"]
# Output:
# ["student123@gmail.com", "teacher.name@soa.edu", "abc.xyz@abc.in"]

def filter_emails(lst):
    valid=[]
    for e in lst:
        if e.count("@")==1:
            u,d=e.split("@")
            if u and u[0].isalnum() and all(c.isalnum() or c in "._" for c in u) and "." in d:
                domain,tld=d.rsplit(".",1)
                if domain.isalpha() and tld.isalpha() and 2<=len(tld)<=4:
                    valid.append(e)
    return valid
emails=["student123@gmail.com","teacher.name@soa.edu","abc.xyz@abc.in","xyz#12@abc.com","bad@1n.com"]
print(filter_emails(emails))