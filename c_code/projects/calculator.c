// Calculator (two numbers)
#include <stdio.h>

int main (void)
{
    double num1, num2;
    char op;

    printf("\n----------------------------------------------\n");
    printf("BASIC CALCULATOR\n");
    printf("Two numbers, one operator\n");
    printf("----------------------------------------------\n");
    printf("Enter first number: ");
    scanf("%lf", &num1);
    printf("Enter operator (+, -, *, /): ");
    // One space before %c, otherwise it may not work!
    scanf(" %c", &op);
    printf("Enter second number: ");
    scanf("%lf", &num2);
    printf("----------------------------------------------\n");

    if (op == '+')
    {
        printf("Result: %f\n", num1 + num2);
    }

    else if (op == '-')
    {
        printf("Result: %f\n", num1 - num2);
    }

    else if (op == '*')
    {
        printf("Result: %f\n", num1 * num2);
    }

    else if (op == '/')
    {
        printf("Result: %f\n", num1 / num2);
    }

    else
    {
        printf("Invalid Operator.\n");
    }

    return 0;
}
