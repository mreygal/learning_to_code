# This program only works for positive numbers.
# For negative and/or complex numbers, cmath should be imported,
# and then cmath.sqrt(num) should be used.

# Ask and store the number
num = float(input("Enter a number to find its square root: "))

# Calculate de square root
num_sqrt = num**0.5

# Show the results
print("The square root of %0.3f is %0.3f." % (num, num_sqrt))
