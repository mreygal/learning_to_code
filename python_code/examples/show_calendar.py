# This program pulls out a calendar for the selected year

# Import the calendar module
import calendar

# Ask the user to input the year and the month
y = int(input("Enter year: "))
m = int(input("Enter month (1-12): "))

# Prints the selected calendar
print(calendar.month(y, m))
