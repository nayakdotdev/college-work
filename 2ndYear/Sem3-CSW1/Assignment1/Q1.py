# Define a Python function named generate bill(item, price, quantity=1,
# discount=0, tax rate=0.05) that calculates and prints the final payable amount
# for a purchased item after applying the discount and adding tax. The function should
# use default arguments for quantity, discount, and tax rate.
# The function should perform the following steps:
# • Compute the subtotal = price × quantity.
# • Apply a discount percentage on the subtotal.
# • Apply a tax (default = 5%) on the discounted amount.
# • Print a detailed bill summary showing item name, quantity, price, discount, tax,
# and total amount.
# Call the function in different ways:
# i. Using only the required arguments (item and price).
# ii. Providing a custom quantity while keeping default discount and tax.
# iii. Using named arguments for discount and tax while keeping default quantity.
# iv. Providing all arguments explicitly.
# Example:
# Item: Laptop, Quantity: 2, Price: 50000, Discount: 10%, Tax: 5%
# Total Bill: 94500.0

def generate_bill(item,price,quantity=1,discount=0,tax_rate=0.05):
    subtot=price*quantity
    discamt=subtot-(subtot*(discount/100))
    taxamt=discamt*tax_rate
    totamt=discamt+taxamt
    print(f"Item Name: {item}")
    print(f"Price: {price}")
    print(f"Quantity: {quantity}")
    print(f"Discount: {discount}%")
    print(f"Tax Rate: {tax_rate*100}%")
    print(f"Total Amount: {totamt}")
generate_bill("Book",500)
generate_bill("Pen",20,quantity=5)
generate_bill("Headphones",3000,discount=15,tax_rate=0.12)
generate_bill("Laptop",50000,quantity=2,discount=10,tax_rate=0.05)