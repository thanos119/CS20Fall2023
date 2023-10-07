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
    	
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have selected a secret number between 1 and 20.");

        int secretNumber = random.nextInt(20) + 1; // Generate a random number between 1 and 20
        int attempts = 0;
        boolean hasGuessedCorrectly = false;

        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < 1 || userGuess > 20) {
                System.out.println("Please guess a number between 1 and 20.");
            } else if (userGuess < secretNumber) {
                System.out.println("Try a higher number.");
            } else if (userGuess > secretNumber) {
                System.out.println("Try a lower number.");
            } else {
                System.out.println("Congratulations! You guessed the secret number " + secretNumber +
                        " in " + attempts + " attempts.");
                hasGuessedCorrectly = true;
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
