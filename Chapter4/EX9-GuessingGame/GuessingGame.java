/*

Program: GuessingGame.java          Last Date of this Revision: September 29, 2023

Purpose: An application that plays between the computer and the player. The player must guess the
secret number between 1 and 20.

Author: Youssef Mohammed, 
School: CHHS
Course: Computer Programming 20

*/

import java.util.Scanner;
import java.util.Random;

public class GuessingGame 
{
	
    public static void main(String[] args) 
    {
    	
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Step 1: Generate a secret number between 1 and 20
        int secretNumber = random.nextInt(20) + 1;

        // Step 2: Prompt the player for a number between 1 and 20
        System.out.print("Guess the secret number (between 1 and 20): ");
        int playerNumber = scanner.nextInt();

        // Step 3: Compare the player's number to the secret number
        System.out.println("Secret Number: " + secretNumber);
        System.out.println("Your Guess: " + playerNumber);

        // Step 4 and 5: Check if the player's number matches the secret number
        if (playerNumber == secretNumber) {
            System.out.println("You Won!");
        } else {
            System.out.println("Better luck next time.");
        }

        scanner.close();
    }
}


/* Screen Dump

Guess the secret number (between 1 and 20): 5
Secret Number: 2
Your Guess: 5
Better luck next time.
 
 */