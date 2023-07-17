# This program checks whether a number is or isn't a palindrome

# Ask the user to input a number
num = int(input("Enter an integer: "))

# Store the number
original = num

# Declare a variable for the reverse and give it a value of zero
reversed = 0

while num != 0:
    single_digit = num % 10
    reversed = reversed * 10 + single_digit
    num //= 10

# Tell the user if the number is or isn't a palindrome
if original == reversed:
    print("The number you entered IS a palindrome")
else:
    print("The number you entered IS NOT a palindrome")
