/*

Program: Digits.java          Last Date of this Revision: September 29, 2023

Purpose: An application that prompts the user for a two-digit number and then displays the ones-place
and tens-place.

Author: Youssef Mohammed, 
School: CHHS
Course: Computer Programming 20
 
*/

package Skillbuilders;

import java.util.Scanner;

public class Digits 
{
	
    public static void main(String[] args) 
    {
    	
        Scanner scanner = new Scanner(System.in);

        // Displaying a question for the user to type a two-digit number.
        System.out.print("Enter a two-digit number: ");
        int twoDigitNumber = scanner.nextInt();

        //  Extracting the ones-place and tens-place digits on the given two-digit number.
        if (twoDigitNumber >= 10 && twoDigitNumber <= 99) {
            int tensPlace = twoDigitNumber / 10;
            int onesPlace = twoDigitNumber % 10;

            // Displays the results to the user of how many ones place and tens place.
            System.out.println("Tens Place: " + tensPlace);
            System.out.println("Ones Place: " + onesPlace);
        } else {
            System.out.println("Invalid input. Please enter a two-digit number.");
        }

        scanner.close();
    }
}

/* Screen Dump

Enter a two-digit number: 20
Tens Place: 2
Ones Place: 0
 
 */
