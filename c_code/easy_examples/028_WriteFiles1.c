#include <stdio.h>

int main (void)
{
    // "r" means read, "w" means write, "a" means append.
    // Address of new file may need to be changed
    
    FILE * fpointer = fopen("employees.txt", "w");
   
    fprintf(fpointer, "Mike, Heart Surgeon\nLaura, Nurse\nTodd, Secretary");
    
    fclose(fpointer);

    return 0;
}
