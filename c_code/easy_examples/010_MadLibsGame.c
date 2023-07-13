#include <stdio.h>

int main()
{
    char color[20];
    char pluralNoun[20];
    char celebrityF[20];
    char celebrityL[20];
    
    printf("\nEnter a color: ");
    scanf("%s", color);
    printf("\nEnter a plural noun: ");
    scanf("%s", pluralNoun);
    printf("\nEnter a celebrity (first and last names): ");
    scanf("%s%s", celebrityF, celebrityL);
    
    // Separator
    printf("\n-------------------------------------------\n");	

    printf("Roses are %s\n", color);
    printf("%s are blue\n", pluralNoun);
    // Note the two "%s", one for first and last names
    printf("I love %s %s\n\n", celebrityF, celebrityL);
    
    return 0;
}
