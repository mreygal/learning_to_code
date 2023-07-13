# This program counts the number of each vowel in a string

# Define a string of vowels
vowels = "aeiou"

# Ask user for string
string = input("Enter a string: ")

# Equalize lower case and upper case
string = string.casefold()

# Initialize the vowel count at 0 for each vowel
counter = {}.fromkeys(vowels, 0)

# Count!
for char in string:
    if char in counter:
        counter[char] += 1

print(counter)
