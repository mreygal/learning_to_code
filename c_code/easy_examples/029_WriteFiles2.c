#include <stdio.h>

int main (void)
{
    // This program writes on the "employees.txt" file
    // created on "028_WriteFiles1.c" program.
    // Thus, the "a" is used for apendding text.

    FILE * fpointer = fopen("employees.txt", "a");

    fprintf(fpointer, "\nLawrence, Rare Illnesses Investigator");

    fclose(fpointer);

    return 0;
}
