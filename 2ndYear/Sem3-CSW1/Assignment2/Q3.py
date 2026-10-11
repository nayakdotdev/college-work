# Write a menu-driven Python program to implement a Stack using a list. Define separate methods for each stack operation as follows:
# • push(x) – To insert an element into the stack.
# • pop() – To remove and return the top element from the stack.
# • is empty() – To check whether the stack is empty.
# • display() – To display all elements of the stack.
# After implementing the stack operations, write a separate method to evaluate a Reverse Polish Notation (RPN) expression using the stack. The RPN evaluation should
# correctly handle operands and operators, following postfix evaluation rules.
# Example Output:
# Stack Operations:
# 1. Push
# 2. Pop
# 3. Display
# 4. Evaluate RPN
# Enter choice: 4
# Enter RPN Expression: 5 3 4 * +
# Result: 17

def push(stack,x):
    stack.append(x)
def pop(stack):
    if len(stack)==0:
        print("Stack is Empty")
    else:
        print("Popped:",stack.pop())
def is_empty(stack):
    return len(stack)==0
def display(stack):
    print("Stack:",stack)
def evaluate_rpn(exp):
    stack=[]
    for x in exp.split():
        if x in "+-*/":
            b=stack.pop()
            a=stack.pop()
            if x=='+':
                stack.append(a+b)
            elif x=='-':
                stack.append(a-b)
            elif x=='*':
                stack.append(a*b)
            else:
                stack.append(a/b)
        else:
            stack.append(int(x))
    return stack.pop()
stack=[]
while True:
    print("Stack Operations:")
    print("1. Push\n2. Pop\n3. Display\n4. Evaluate RPN\n5. Exit")
    ch=int(input("Enter choice: "))
    if ch==1:
        x=int(input("Enter element: "))
        push(stack,x)
    elif ch==2:
        pop(stack)
    elif ch==3:
        display(stack)
    elif ch==4:
        exp=input("Enter RPN Expression: ")
        print("Result:",evaluate_rpn(exp))
    elif ch==5:
        break
    else:
        print("Invalid Choice")