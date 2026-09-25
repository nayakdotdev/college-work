op=input("Enter operation (add/sub/mul/div/mod): ")
if op=='add' or op=='sub' or op=='mul' or op=='div' or op=='mod':
    x=int(input("Enter first number: "))
    y=int(input("Enter second number: "))
    if op=='add':
        print(f"{x}+{y}={x+y}")
    elif op=='sub':
        print(f"{x}-{y}={x-y}")
    elif op=='mul':
        print(f"{x}x{y}={x*y}")
    elif op=='div':
        if y==0:
            print("Error: Division by Zero not Allowed")
        else:
            print(f"{x}/{y}={x/y}")
    elif op=='mod':
        if y==0:
            print("Error: Division by Zero not Allowed")
        else:
            print(f"{x}%{y}={x%y}")