# Make the user input an integer
num = int(input("Enter an integer number: "))

# If else statement to show whether the number is even or odd
if (num % 2) == 0:
    print("{0} is an EVEN integer.".format(num))
else:
    print("{0} is and ODD integer.".format(num))
