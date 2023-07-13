#include <stdio.h>

int main (void)
{
    int age = 30;
    int * pAge = &age;
    double gpa = 3.4;
    double * pGpa = &gpa;
    char grade = 'A';
    char * pGrade = &grade;

    printf("----------------------------------------------------");
    printf("\nage memory address: %p\n", &age);
    printf("age memory address's memory address: %p\n", &pAge);
    printf("----------------------------------------------------\n");
    printf("gpa memory address: %p\n", &gpa);
    printf("gpa memory address's memory address: %p\n", &pGpa);
    printf("----------------------------------------------------\n");
    printf("grade memory address: %p\n", &grade);
    printf("grade memory address's memory address: %p\n", &pGrade);
    printf("----------------------------------------------------\n");

    return 0;
}
