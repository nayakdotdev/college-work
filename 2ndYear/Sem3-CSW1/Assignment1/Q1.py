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