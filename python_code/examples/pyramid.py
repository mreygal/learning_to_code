# This program creates a pyramid in the style of CS50's pset


def pyramid_creator(height):
    for i in range(height + 1):
        space_1 = " " * (height - i)
        hashes = "#" * i
        space_2 = "  "
        print(space_1 + hashes + space_2 + hashes)


# User input
size = int(input("Enter size of the pyramid: "))

# Call the function to make the pyramid
pyramid_creator(size)
