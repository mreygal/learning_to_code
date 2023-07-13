# This program generates a random number

# Import the random module
import random

# Ask user for minimum and maximum number
num1 = int(input("Enter a minimum integer number: "))
num2 = int(input("Enter a maximum integer number: "))

# Generate the random number between those two numbers
print("Random number between those numbers: {0}.".format(random.randint(num1, num2)))
