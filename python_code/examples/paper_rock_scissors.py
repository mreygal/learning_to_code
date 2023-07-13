from random import randint

# List of play options
options = ["Rock", "Paper", "Scissors"]

# Random number for computer
computer = options[randint(0, 2)]

# Setting counter to 0 so the first one to make it to three wins
player_counter = 0
computer_counter = 0


# Function to show the score
def score():
    print("PLAYER:", player_counter, " COMPUTER:", computer_counter)


# Presentation
print("\nRock, Paper, Scissors\n(win 3 times)\n--------------------------")

# Instructions and is else for the game
while player_counter < 3 and computer_counter < 3:
    player1 = input("\nType Rock, Paper or Scissors: ")
    if player1 == computer:
        print("COMPUTER:", computer)
        print("-----\nTie!")
        score()
    elif player1 == "Paper":
        if computer == "Scissors":
            print("COMPUTER:", computer)
            print("-----\nYou lost!")
            computer_counter += 1
            score()
        else:
            print("COMPUTER:", computer)
            print("----\nYou win!")
            player_counter += 1
            score()
    elif player1 == "Rock":
        if computer == "Paper":
            print("COMPUTER:", computer)
            print("-----\nYou lost!")
            computer_counter += 1
            score()
        else:
            print("COMPUTER:", computer)
            print("-----\nYou win!")
            player_counter += 1
            score()
    elif player1 == "Scissors":
        if computer == "Rock":
            print("COMPUTER:", computer)
            print("-----\nYou lost!")
            computer_counter += 1
            score()
        else:
            print("COMPUTER:", computer)
            print("-----\nYou win!")
            player_counter += 1
            score()
    else:
        print("Incorrect parameter, please try again")

    computer = options[randint(0, 2)]
