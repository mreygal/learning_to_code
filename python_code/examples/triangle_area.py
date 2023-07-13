# Store the numbers
num1 = float(input("Enter first number: "))
num2 = float(input("Enter second number: "))
num3 = float(input("Enter third number: "))

# Calculate the semi-perimeter of the triangle
sp = (num1 + num2 + num3) / 2

# Calculate the area
area = (sp * (sp - num1) * (sp - num2) * (sp - num3)) ** 0.5

# Show the results
print("The area of the triangle you entered is %0.2f." % area)
