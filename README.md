# Number Guessing Game

Welcome to the Number Guessing Game! This Java-based game allows players to guess a randomly generated number within a specified range and difficulty level.

## Features

- Multiple difficulty levels: Easy, Medium, and Hard.
- User-friendly interface with prompts and feedback.
- Allows players to play multiple rounds until they decide to quit.

## Installation

# 1. Clone the repository to your local machine:
   ```sh
   git@github.com:AbdulRehman-18/NumberGuessingGame.git
   ```
# 2.Navigate to the project directory:
```sh
cd number-guessing-game
```
# 3.How to Play
  1. Run the NumberGuessingGame class to start the game.
  2. Choose a difficulty level:

     -Easy:(10 chances)
     
     -Medium:(5 chances)
     
     -Hard:(3 chances)
     
  4. Enter your guesses as prompted by the game.
  5. The game provides feedback on whether your guess is higher or lower than the randomly generated number.
  6. Continue guessing until you find the correct number or run out of attempts.
  7. After each round, you can choose to play again or quit the game.

# 4.Code Structure
Guess: A class containing the logic for the guessing game, including generating random numbers and checking user guesses.
NumberGuessingGame: The main class that starts the game, handles user inputs for difficulty level, and manages game rounds.

## Sample Output
```Markdown
Welcome to the Number Guessing Game!
I'm thinking of a number between 1 and 100.

Please select the difficulty level:
1. Easy (10 chances)
2. Medium (5 chances)
3. Hard (3 chances)
4. Quit

Enter your choice: 2
Great! You have selected the Medium difficulty level. Let's start the game!
Enter your guess: 50
Incorrect! The number is less than 50.
Enter your guess: 30
Incorrect! The number is greater than 30.
Enter your guess: 40
Incorrect! The number is greater than 40.
Enter your guess: 45
Incorrect! The number is less than 45.
Enter your guess: 42
Congratulations! You guessed the correct number in 5 attempts.

Game Over!
```

https://roadmap.sh/projects/number-guessing-game
