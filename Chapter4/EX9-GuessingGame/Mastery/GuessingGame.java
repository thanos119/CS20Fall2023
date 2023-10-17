/*

Program: GuessingGame.java          Last Date of this Revision: September 29, 2023

Purpose: An application that plays between the computer and the player. The player must guess the
secret number between 1 and 20.

Author: Youssef Mohammed, 
School: CHHS
Course: Computer Programming 20

*/
package Mastery;

import java.util.Scanner;
import java.util.Random;

public class GuessingGame 
{
	
    public static void main(String[] args) 
    {
    	
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // First this will generate a random secret number which is 1-20.
        int secretNumber = random.nextInt(20) + 1;

        // This will prompt the user to input a value (their guess).
        System.out.print("Guess the secret number (between 1 and 20): ");
        int playerNumber = scanner.nextInt();

        // After receiving both values, it'll compare the two values.
        System.out.println("Secret Number: " + secretNumber);
        System.out.println("Your Guess: " + playerNumber);

        // This checks if the player's number matches with the secret number.
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