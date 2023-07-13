#include <stdio.h>
#include <string.h> // It's important to include this library for strcpy

struct Student
{
    char name[50];
    char major[50];
    int age;
    double gpa;
};

int main (void)
{
    struct Student student1;

    strcpy(student1.name, "Michael Johnson");
    strcpy(student1.major, "General Medicine");
    student1.age = 22;
    student1.gpa = 3.2;

    printf("\nNAME: %s\n", student1.name);
    printf("\nMAJOR: %s\n", student1.major);
    printf("\nAGE: %d\n", student1.age);
    printf("\nGPA: %f\n", student1.gpa);

    return 0;
}

