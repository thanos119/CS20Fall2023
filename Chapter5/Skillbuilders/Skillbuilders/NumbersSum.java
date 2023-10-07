/*

Program: Delivery.java          Last Date of this Revision: October 7, 2023

Purpose: An application that prompts the user for a number and then displays the numbers 1 through
the number entered and below the numbers, the sum is displayed.

Author: Youssef Mohammed, 
School: CHHS
Course: Computer Programming 20

*/

package Skillbuilders;
import java.util.Scanner;

public class NumbersSum 
{
	
    public static void main(String[] args) 
    {
    	
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize the sum to 0
        int sum = 0;

        // Display the numbers from 1 to the entered number and calculate the sum
        System.out.println("Numbers from 1 to " + number + ":");
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
            sum += i;
        }

        // Display the sum
        System.out.println("Sum of numbers from 1 to " + number + " is: " + sum);

        scanner.close();
    }
}

/* Screen Dump

Enter a number: 5
Numbers from 1 to 5:
1
2
3
4
5
Sum of numbers from 1 to 5 is: 15
 
 */