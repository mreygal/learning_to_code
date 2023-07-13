#include <stdio.h>

double cube(double num)
{
    double result = num * num * num;
    return result;
}

int main (void)
{
    printf("\nAnswer: %f\n", cube(3.0));

    return 0;
} 
