/*

Program: RandomNum.java          Last Date of this Revision: September 29, 2023

Purpose: An application that prompts the user for two numbers.

Author: Youssef Mohammed, 
School: CHHS
Course: Computer Programming 20

*/

package Skillbuilders;

import java.util.Scanner;
import java.util.Random;

public class RandomNum 
{
	
    public static void main(String[] args) 
    {
    	
        Scanner scanner = new Scanner(System.in);

        // Input: Minimum and Maximum values
        System.out.print("Enter the minimum value: ");
        int minValue = scanner.nextInt();

        System.out.print("Enter the maximum value: ");
        int maxValue = scanner.nextInt();

        if (minValue < maxValue) {
            // Create a Random object
            Random random = new Random();

            // Generate a random integer between minValue and maxValue (inclusive)
            int randomNum = random.nextInt(maxValue - minValue + 1) + minValue;

            // Display the random number
            System.out.println("Random number between " + minValue + " and " + maxValue + ": " + randomNum);
        } else {
            System.out.println("Invalid input. The minimum value should be less than the maximum value.");
        }

        scanner.close();
    }
}

/* Screen Dump

Enter the minimum value: 5
Enter the maximum value: 16
Random number between 5 and 16: 15
 
 */