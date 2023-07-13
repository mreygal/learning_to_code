#include <stdio.h>

int main (void)
{
    int size;

    do
    {    
        printf("Enter size (1-10): ");
        scanf("%d", &size);
    }
    while (size > 10 || size <= 0);

    // For each line
    for (int line = 0; line < size; line++)
    {
        // For initial space
        for (int space1 = size - line; space1 >= 0; space1--)
        {
            printf(" ");
        }

        // For first set of blocks
        for (int blocks = 0; blocks < line; blocks++)
        {
            printf("#");
        }

        // For cusp/middle 
        for (int cusp = 0; cusp  < 1; cusp++)
        {
            printf("#");
        }

        // For second set of blocks (same code as first set of blocks)
        for (int blocks = 0; blocks < line; blocks++)
        {
            printf("#");
        }
        
        // For moving to next line
        printf("\n");
    }

    return 0;
}
