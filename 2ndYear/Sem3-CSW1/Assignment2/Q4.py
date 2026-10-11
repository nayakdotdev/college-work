# Write a Python program to perform various matrix operations using nested lists.
# The program should perform the following tasks:
# i. Create two 2 × 2 matrices using nested lists.
# ii. Compute and print their sum and product (matrix multiplication).
# iii. Display both matrices and their results in a proper formatted output.
# iv. Sort the rows of the resultant matrix based on the sum of each row and display
# the sorted matrix.
# Input: Elements of two 2 × 2 matrices entered by the user.
# Output: Display the two input matrices, their sum, product, and the sorted resultant
# matrix (based on row sums).

A=[[int(input("Enter A[0][0]: ")),int(input("Enter A[0][1]: "))],
   [int(input("Enter A[1][0]: ")),int(input("Enter A[1][1]: "))]]
B=[[int(input("Enter B[0][0]: ")),int(input("Enter B[0][1]: "))],
   [int(input("Enter B[1][0]: ")),int(input("Enter B[1][1]: "))]]
add=[[A[i][j]+B[i][j] for j in range(2)] for i in range(2)]
prod=[[sum(A[i][k]*B[k][j] for k in range(2)) for j in range(2)] for i in range(2)]
print("Matrix A:",A)
print("Matrix B:",B)
print("Sum:",add)
print("Product:",prod)
sorted_matrix=sorted(prod,key=sum)
print("Sorted Matrix:",sorted_matrix)