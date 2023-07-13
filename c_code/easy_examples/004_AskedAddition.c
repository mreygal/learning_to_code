#include <stdio.h>

int main (void)
{
	unsigned int result = 0;

	while (result != 5)
	{
		printf("\nWhat is 2 + 3?\n");
		scanf("%d", &result);
		fflush(stdin);

		if (result == 5)
		{
			printf("\nCORRECT\n");
		}	

		else
		{
			printf("\nINCORRECT. Try again\n");
		}	
	}	
	return 0;
}	
