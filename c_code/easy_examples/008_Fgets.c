#include <stdio.h>

int main (void)
{
	char textSpaces[20];
	printf("\nEnter text with spaces (max 20 characters): ");
	fgets(textSpaces, 20, stdin);
	printf("\nYour text is: %s\n", textSpaces);

	return 0;
}	

