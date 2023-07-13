#include <stdio.h>

int main (void)
{
    int age = 30;
    int *pAge = &age;

    // The %d is there because the pointer's CONTENT is an int (age = 30)
    printf("\n%d\n", *pAge);
    printf("%d\n", * &age);

    return 0;
} 
