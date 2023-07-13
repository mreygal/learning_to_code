#include <stdio.h>

int main (void)
{
    int secretNumber = 5;
    int guess;
    int guessCount = 0;
    int guessLimit = 3;
    int outOfGuesses = 0;

    printf("\nGUESS THE NUMBER (1-10): ");
    printf("\nYou have three chances\n\n");
    
    while (guess != secretNumber && outOfGuesses == 0)
    {
        if (guessCount < guessLimit)
        {
            printf("Enter a number: ");
            scanf("%d", &guess);
            guessCount++;
        }

        else
        {
            outOfGuesses = 1;
        }
    }

    if (outOfGuesses == 1)
    {
        printf("\nOut of guesses...\n");
    }

    else
    {
        printf("\nYou Win!\n");
    }

    return 0;
}
