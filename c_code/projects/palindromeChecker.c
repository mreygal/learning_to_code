#include <stdio.h>

int main (void)
{
    int n, original, reversed = 0, remainder;
    
    printf("\nEnter integer number: ");
    scanf("%d", &n);

    original = n;

    while (n > 0)
    {
        remainder = n % 10;
        reversed = reversed * 10 + remainder;
        n /= 10;
    }

    if (original == reversed)
    {
        printf("\n%d is a palindrome\n", original);
    } 

    else
    {
        printf("\n%d is NOT a palindrome\n", original);
    }

    return 0;
}
