# LEAP YEAR CHECKER

# Input the year
year = int(input("Enter a year: "))

# If a year is % by 100, then it's a century, and that century year % by 400
# is a leap year
if (year % 400 == 0) and (year % 100 == 0):
    print("{0} IS a leap year.".format(year))

# If a year is not % by 100, then it's not a century, and that year % by 4
# is a leap year
elif (year % 4 == 0) and (year % 100 != 0):
    print("{0} IS a leap year.".format(year))

# If a year is not % by 400 and by 4, then that year is not a leap year
else:
    print("{0} is NOT a leap year.".format(year))
