#include <stdio.h>

void sayHi (char name[], int age)
{
    printf("\nHello %s, you are %d.\n", name, age);
}


int main (void)
{
    sayHi("Mike", 40);
    sayHi("Tom", 23);
    sayHi("Oscar", 70);

    return 0;
} 
