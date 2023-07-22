# We need to import the datetime module
import datetime

# We create the variable "time" and asign it the time value from now
time = datetime.datetime.now()

# We print the time with a specific format
print("Current date and time is: " + time.strftime("%Y-%m-%d %H:%M:%S"))
