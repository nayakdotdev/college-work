# Write a Python generator function called filter high sales that takes a list of daily
# sales amounts and a threshold value.
# • The function should yield only those sales amounts that are greater than or
# equal to the given threshold.
# • Demonstrate this generator by providing it with a list of sales and printing all
# high sales (e.g., sales above $500).
# Example Output:
# Daily Sales: [250, 800, 450, 1200, 600]
# Threshold: 500
# High Sales:
# 800
# 1200
# 600

def filter_high_sales(sales,threshold):
    for s in sales:
        if s>=threshold:
            yield s
sales=[250,800,450,1200,600]
threshold=500
print(f"Daily Sales: {sales}")
print(f"Threshold: {threshold}")
print("High Sales:")
for s in filter_high_sales(sales,threshold):
    print(s)