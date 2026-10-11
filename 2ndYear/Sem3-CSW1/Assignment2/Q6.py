# Write a Python function that takes a dictionary where:
# • The values can be either a list or a tuple of integers.
# • If the value is a list, find the sum of all prime numbers in that list.
# • If the value is a tuple, find the product of all odd numbers in that tuple.
# The function should return a new dictionary where the keys remain the same, but
# the values are replaced with the computed results according to the above rules.
# Input: A dictionary containing lists or tuples of integers. (e.g., data = {”A”: [2,
# 3, 4, 5, 10], ”B”: (1, 2, 3, 4, 5), ”C”: [7, 8, 9], ”D”: (6, 7,
# 8)})
# Output: Display the new dictionary after computing the respective operations.

def is_prime(n):
    return n>1 and all(n%i!=0 for i in range(2,int(n**0.5)+1))
def process(data):
    res={}
    for k,v in data.items():
        if isinstance(v,list):
            res[k]=sum(n for n in v if is_prime(n))
        else:
            p=1
            for n in v:
                if n%2!=0:
                    p*=n
            res[k]=p
    return res
data={"A":[2,3,4,5,10],"B":(1,2,3,4,5),"C":[7,8,9],"D":(6,7,8)}
print(process(data))