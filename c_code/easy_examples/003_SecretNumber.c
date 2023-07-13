#include <stdio.h>

#define SECRET 9

int main (void)
{
	int n;
	printf("\nEnter secret number: ");
	scanf("%d", &n);
	fflush(stdin);

	if (n == SECRET)
	{
		printf("\nCORRECT\n");
	}	

	else
	{
		printf("\nINCORRECT\n");
	}	

	return 0;
}	
