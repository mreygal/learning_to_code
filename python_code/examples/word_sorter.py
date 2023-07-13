# This program orders words alphabetically

# Ask th user for a string
string = input("Enter a string: ")

# Define words and split them at whitespaces with .split
words = [word.lower() for word in string.split()]

# Sort the words
words.sort()

# Print results
print("The words you entered, alphabetically ordered, are as follows:")
for word in words:
    print(word)
