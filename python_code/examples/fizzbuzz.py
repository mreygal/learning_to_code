def fizz_buzz(n):
    for i in range(1, n + 1):
        if i % 3 == 0:
            print(str(i) + " fizz")
        elif i % 5 == 0:
            print(str(i) + " buzz")
        else:
            print(i)

fizz_buzz(15)