// Fahrenheit to Celsius/Celsius to Fahrenheit Calculator
#include <stdio.h>

int main (void)
{
    int s;
    float c, f;
 
    printf("-------------------------------------");
    printf("\nFahrenheit to Celsius ---> Enter 1\n");
    printf("Celsius to Fahrenheit ---> Enter 2\n");
    printf("-------------------------------------\n");
    scanf("%d", &s);

    switch (s)
    {
        case 1: printf("\nEnter Fahrenheit value: ");
                scanf("%f", &f);

                c = (f - 32) * 0.5556;
                printf("...............................\n");
                printf("%f degrees Celsius.\n", c);
                printf("...............................\n\n");
                break;

        case 2: printf("\nEnter Celsius value: ");
                scanf("%f", &c);

                f = (c * 1.8) + 32;
                printf("...............................\n");
                printf("%f degrees Fahrenheit.\n", f);
                printf("...............................\n\n");
                break;

        default: printf("Wrong input. Please select 1 or 2 next time.\n\n");
    }

    return 0;
}
