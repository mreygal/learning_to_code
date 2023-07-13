#include <stdio.h>

int main()
{
    char grade;

    printf("\nEnter grade (A, B, C or F): ");
    scanf("%c", &grade);

    switch(grade)
    {
        case 'A':
            printf("\nYou did great!\n");
            break;

        case 'B':
            printf("\nYou did alright.\n");
            break;
            
        case 'C':
            printf("\nYou did poorly.\n");
            break;

        case 'F':
            printf("\nYou failed...\n");
            break;

        default:
            printf("\nInvalid grade\n");
    }

    return 0;
}
