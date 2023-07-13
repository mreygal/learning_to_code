#include <stdio.h>

int main (void)
{
	int age;

	// First, we ask for the age
	printf("\nEnter your age: ");
	scanf("%d", &age);
	printf("\nYou are %d years old.\n", age);

	// Then, we ask for the GPA, which needs a double (not int)
	double gpa;
	printf("\nEnter your GPA: ");
	scanf("%lf", &gpa);
	printf("Your GPA is %.2f\n", gpa);

	/* The one below would only work if it's the only function
	char grade;
	printf("\nEnter your grade: ");
	scanf("%c", &grade);
	printf("Your grade is %c.\n", grade);
	*/

	return 0;
}	
