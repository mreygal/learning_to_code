// Scrabble game
// This was done by me for CS50 class under username "MRG (meruay)"
// I converted it to C without the cs50.h library 

#include <ctype.h>
#include <stdio.h>
#include <string.h>

// Points assigned to each letter of the alphabet
int POINTS[] = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};

int compute_score(char word[30]);

int main(void)
{
    char word1[30];
    char word2[30];
    
    // Get input words from both players
    printf("\nSCRABBLE FOR TWO PLAYERS\n");
    printf("--------------------------\n");
    printf("Word PLAYER 1: ");
    scanf("%s", &word1);
    printf("Word PLAYER 2: ");
    scanf("%s", &word2);
    

    // Score both words
    int score1 = compute_score(word1);
    int score2 = compute_score(word2);

    // Print the winner
    if (score1 < score2)
    {
        printf("\nPlayer 1 points: %i", score1);
        printf("\nPlayer 2 points: %i", score2);
        printf("\n--------------------");
        printf("\nPlayer 2 Wins!\n\n\n");
    }

    else if (score1 > score2)
    {
        printf("\nPlayer 1 points: %i", score1);
        printf("\nPlayer 2 points: %i", score2);
        printf("\n--------------------");
        printf("\nPlayer 1 Wins!\n\n\n");
    }

    else
    {
        printf("\nPlayer 1 points: %i", score1);
        printf("\nPlayer 2 points: %i", score2);
        printf("\n--------------------");
        printf("\nTie!\n\n\n");
    }

    printf("\n");
}

// Function protoyped at line #8
int compute_score(char word[20])
{
    //  Compute and return score for string
    int score = 0;

    for (int i = 0; i < strlen(word); i++)
    {
        if (isupper(word[i]))
        {
            // Position of letter in ASCII table minus difference to take array position from line #7
            score = score + POINTS[word[i] - 65];
        }

        if (islower(word[i]))
        {
            // Position of letter in ASCII table minus difference to take array position from line #7
            score = score + POINTS[word[i] - 97];
        }
    }
    return score;
}
