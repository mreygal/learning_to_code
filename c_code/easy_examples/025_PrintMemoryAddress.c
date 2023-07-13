#include <stdio.h>

int main (void)
{
    int age = 30;
    double gpa = 3.4;
    char grade = 'A';

    printf("\nage: %p\ngpa: %p\ngrade: %p\n\n", &age, &gpa, &grade);

    return 0;
}
