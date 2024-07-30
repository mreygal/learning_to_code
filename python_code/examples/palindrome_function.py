def numbers():
    num =  2122
    return num


def isPalindrome(numero):
    original = numero
    reversed = 0
    while numero != 0:
        remainder = numero % 10
        reversed = reversed * 10 + remainder
        numero //= 10
    if original == reversed:
        print("PALINDROME")
    else:
        print("NOT PALINDROME")


isPalindrome(numbers())