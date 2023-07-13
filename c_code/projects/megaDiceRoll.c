#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main (void)
{

	// Variables used
	int ltime;
	long stime;
	int n1, n2;
	int randomNumbers;
	int i;
	int one = 0, two = 0, three = 0, four = 0, five = 0, six = 0;
	int seven = 0, eight = 0, nine = 0, ten = 0;
	int sum = 0;
	float average;
	float oneP, twoP, threeP, fourP, fiveP, sixP, sevenP, eightP, nineP, tenP;


	// I use srand with time so that I get a different seed every round
	srand(stime);
	ltime =time(NULL);
	stime = (unsigned) ltime / 2;

	// I ask for type (# of sides) of dice
	do
	{
		printf("\nNumber of sides of the dice (2-10): ");
		scanf("%d", &n1);
	}
	while (n1 < 2 || n1 > 10);

	// I ask for number of dice
	do
	{
		printf("\nNumber of dice (1-1.000.000): ");
		scanf("%d", &n2);
	}
	while (n2 < 1 || n2 > 1000000);

	// Loop to get dice rolls
	for (i = 0; i < n2; i++)
	{
		randomNumbers = ((rand() % n1) + 1);
		sum = sum + randomNumbers;
		switch (randomNumbers)
		{
			case 1: one++;
				break;	  
			case 2: two++;
	  			break;
			case 3: three++;
				break;	  
			case 4: four++;
				break;	  
			case 5: five++;
				break;	  
			case 6: six++;
				break;	  
			case 7: seven++;
				break;
			case 8: eight++;
				break;
			case 9: nine++;
				break;
			case 10: ten++;
			 	break;	 
		}	
	}

	// Calculate average
	average = (float)sum / n2;

	// Calculate percengage of each number
	oneP = (float)one * 100 / n2;
	twoP = (float)two * 100 / n2;
	threeP = (float)three * 100 / n2;
	fourP = (float)four * 100 / n2;
	fiveP = (float)five * 100 / n2;
	sixP = (float)six * 100 / n2;
	sevenP = (float)seven * 100 / n2;
	eightP = (float)eight * 100 / n2;
	nineP = (float)nine * 100 / n2;
	tenP = (float)ten * 100 / n2;

	// Print sum of numbers + average + percentage in all rolls
	printf("\n---------------------------------------------");
	printf("\nSum of all dice: %d", sum);
	printf("\n---------------------------------------------");
	printf("\nAverage: %f", average); 
	printf("\n---------------------------------------------");
	printf("\n# of 1:  %d  --->  %.10f%%\n", one, oneP);
	printf("\n# of 2:  %d  --->  %.10f%%\n", two, twoP);
	printf("\n# of 3:  %d  --->  %.10f%%\n", three, threeP);
	printf("\n# of 4:  %d  --->  %.10f%%\n", four, fourP);
	printf("\n# of 5:  %d  --->  %.10f%%\n", five, fiveP);
	printf("\n# of 6:  %d  --->  %.10f%%\n", six, sixP);
	printf("\n# of 7:  %d  --->  %.10f%%\n", seven, sevenP);
	printf("\n# of 8:  %d  --->  %.10f%%\n", eight, eightP);
	printf("\n# of 9:  %d  --->  %.10f%%\n", nine, nineP);
	printf("\n# of 10: %d  --->  %.10f%%\n", ten, tenP);
	printf("---------------------------------------------\n");

	return 0;
}
