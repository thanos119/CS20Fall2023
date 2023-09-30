/*

Program: PerfectSquare.java          Last Date of this Revision: September 29, 2023

Purpose: An application that prompts the user for an integer and then displays a message indicating
whether or not the number is a perfect square.

Author: Youssef Mohammed, 
School: CHHS
Course: Computer Programming 20

*/

package Skillbuilders;

import java.util.Scanner;

public class PerfectSquare 
{
	
    public static void main(String[] args) 
    {
    	
        Scanner scanner = new Scanner(System.in);

        // Input: User enters an integer
        System.out.print("Enter an integer: ");
        int userInput = scanner.nextInt();

        // Calculate the square root and truncate the result
        double squareRoot = Math.sqrt(userInput);
        int truncatedSquareRoot = (int) squareRoot;

        // Check if squaring the truncated result equals the original number
        if (truncatedSquareRoot * truncatedSquareRoot == userInput) {
            System.out.println(userInput + " is a perfect square.");
        } else {
            System.out.println(userInput + " is not a perfect square.");
        }

        scanner.close();
    }
}


/* Screen Dump

Enter an integer: 16
16 is a perfect square.
 
 */