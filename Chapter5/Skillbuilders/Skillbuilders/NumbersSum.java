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

        // Prompt the user for a number.
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initializing the sum to 0.
        int sum = 0;

        // This'll display the numbers from 1 to the entered number by the user and calculate the sum.
        System.out.println("Numbers from 1 to " + number + ":");
        for (int i = 1; i <= number; i++) {  //The loop continues as long as "i" is less than or equal to the value of number. It iterates 
            System.out.println(i); // from 1 up to and including the value of "number".
            sum += i;
        }

        // Once finished it'll display the results to the user.
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