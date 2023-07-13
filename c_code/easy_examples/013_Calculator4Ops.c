#include <stdio.h>

int main (void)
{
    // Declare local variables
    char opt;
    int n1, n2;
    float res;

    printf("\nCALCULATOR IN C LANGUAGE");
    printf("\n------------------------");
    printf("\nSelect an operator (+, -, *, /): ");
    scanf("%c", &opt);
    printf("\nEnter first number: ");
    scanf("%d", &n1);
    printf("\nEnter second number: ");
    scanf("%d", &n2);

    switch (opt)
    {
        case '+': res = n1 + n2;
                  printf("\n\nResult: %f\n", res);
                  break;

        case '-': res = n1 - n2;
                  printf ("\n\nResult: %f\n", res);
                  break;

        case '*': res = n1 * n2;
                  printf("\n\nResult: %f\n", res);
                  break;

        case '/': res = (double)n1 / (double)n2;
                  printf("\n\nResult: %f\n", res);
                  break;

        default: printf("\nInvalid operator.\n");
    } 

    return 0;
} 
