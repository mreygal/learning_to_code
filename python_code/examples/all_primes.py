# This program prints all prime numbers found in a interval of numbers

# Ask the user for the limits
lower = int(input("Enter a low number: "))
upper = int(input("Enter a higher number: "))

# Print the message
print("Prime numbers between", lower, "and", upper, "are:")

# Calculate all the prime numbers in between those two values
for n in range(lower, upper + 1):
    if n > 1:
        for i in range(2, n):
            if (n % i) == 0:
                break
        else:
            print(n)
