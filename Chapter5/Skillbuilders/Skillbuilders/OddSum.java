/*

Program: Delivery.java          Last Date of this Revision: October 7, 2023

Purpose: An application that prompts the user for a number and then sums the odd numbers from 
1 to the number entered.

Author: Youssef Mohammed, 
School: CHHS
Course: Computer Programming 20

*/

package Skillbuilders;

import java.util.Scanner;

public class OddSum 
{
	
    public static void main(String[] args) 
    {
    	
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a number.
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initializing the sum to 0.
        int sum = 0;

        // This will calculate the sum of odd numbers from 1 to the entered number by the user.
        for (int i = 1; i <= number; i += 2) { //This is a accumulator that keeps a running total of the odd numbers.
            sum += i;
        }

        // It'll display the sum letting the user know what it is.
        System.out.println("Sum of odd numbers from 1 to " + number + " is: " + sum);

        scanner.close();
    }
}

/* Screen Dump

Enter a number: 5
Sum of odd numbers from 1 to 5 is: 9

 */