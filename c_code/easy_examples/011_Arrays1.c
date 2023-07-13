#include <stdio.h>

int main (void)
{
    // Array indexes start on ZERO (0), so 0 is 4, 2 is 15, etc.
    int luckyNumbers[] = {4, 8, 15, 16, 23, 42};
    //Without following line, it would print 8 instead of 200
    luckyNumbers[1] = 200;
    printf("\n%d\n", luckyNumbers[1]);

    return 0;
} 
