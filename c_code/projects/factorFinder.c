#include <stdio.h>

int main (void)
{
    int number, i;
    
    printf("\nEnter a positive number: ");
    scanf("%d", &number);
    printf("The factors of number %d are: ", number);

    for (i = 1; i <= number; i++)
    {
        if (number % i == 0)
        {
            printf("%d ", i);
        }
    }

    printf("\n");

    return 0;
}
