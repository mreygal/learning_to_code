# This program checks whether a number is prime or not

# Define a boolean and give it a false value
flag = False

# Ask the user for an integer and store it
n = int(input("Enter and integer: "))

# If else statement
if n == 1:
    print(n, "is NOT a prime number.")
elif n > 1:
    for i in range(2, n):
        if (n % i) == 0:
            flag = True
            break

    if flag:
        print(n, "is NOT a prime number")
    else:
        print(n, "IS a prime number")
