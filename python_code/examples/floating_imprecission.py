# This program shows how Python is faced with floating point imprecission,
# just like C is.

x, y = 10, 3
z = x / y

print(f"10 / 3 = {z:.50f}")
