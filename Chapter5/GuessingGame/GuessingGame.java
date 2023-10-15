/*

Program: GuessingGame.java          Last Date of this Revision: October 7, 2023

Purpose: An application that lets the user to keep guessing until the user has guessed
the secret number generated.

Author: Youssef Mohammed, 
School: CHHS
Course: Computer Programming 20

*/

import java.util.Random;
import java.util.Scanner;

public class GuessingGame 
{
    public static void main(String[] args) 
    {
        // Initializing the scanner when the user inputs a value and a random number generator.
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Welcoming the user to the game and letting them know the program has selected a secret number.
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have selected a secret number between 1 and 20.");

        // This generates a random secret number between 1 and 20.
        int secretNumber = random.nextInt(20) + 1;
        int attempts = 0; // Initializing the number of attempts by the user.
        boolean hasGuessedCorrectly = false; // Will stop or flag once the user has guessed correctly.

        // Starts a loop until the user guesses correctly.
        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt(); // Gets the user's guess.
            attempts++; // Increment the attempts.

            // Checks if the user's guess is out of the valid range.
            if (userGuess < 1 || userGuess > 20) {
                System.out.println("Please guess a number between 1 and 20.");
            } else if (userGuess < secretNumber) {
                System.out.println("Try a higher number.");
            } else if (userGuess > secretNumber) {
                System.out.println("Try a lower number.");
            } else {
                // Once the user has guessed correctly, it'll display a congratulatory message.
                System.out.println("Congratulations! You guessed the secret number " + secretNumber +
                        " in " + attempts + " attempts.");
                hasGuessedCorrectly = true; // Set the flag to end the loop.
            }
        }

        scanner.close();
    }
}


/* Screen Dump

Welcome to the Guessing Game!
I have selected a secret number between 1 and 20.
Enter your guess: 5
Try a higher number.
Enter your guess: 3
Try a higher number.
Enter your guess: 9
Congratulations! You guessed the secret number 9 in 3 attempts.

 */
