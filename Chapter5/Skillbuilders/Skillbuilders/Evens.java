/*

Program: Evens.java          Last Date of this Revision: October 7, 2023

Purpose: An application that displays even numbers between 1 and 20.

Author: Youssef Mohammed, 
School: CHHS
Course: Computer Programming 20

*/

package Skillbuilders;

public class Evens 
{
	
    public static void main(String[] args) 
    {
    	// This will let the user know that the following numbers displayed are even numbers between 1-20.
        System.out.println("Even Numbers between 1 and 20:");

        // This will loop through numbers from 1 to 20.
        for (int i = 1; i <= 20; i++) {
            // It'll also check if the number is even divisible by 2.
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        // This is optional but it'll print a new for better formatting.
        System.out.println();
    }
}

/* Screen Dump

Even Numbers between 1 and 20:
2 4 6 8 10 12 14 16 18 20 
 
 */