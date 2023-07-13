#include <stdio.h>

double cube(double num);

int main (void)
{
    printf("\nAnswer: %f\n", cube(3.0));

    return 0;
}

double cube(double num)
{
    return num * num * num;
}
