#include <stdio.h>

int main (void)
{
    char line[255];
    FILE * fpointer = fopen("employees.txt", "r");

    // Use fgets twice to get to the second line of the file
    fgets(line, 255, fpointer);
    fgets(line, 255, fpointer);
    printf("\n%s\n", line);

    fclose(fpointer);

    return 0;
}
