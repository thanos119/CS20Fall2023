/*

Program: Delivery.java          Last Date of this Revision: September 29, 2023

Purpose: An application that prompts the user for the length, width, and height, of a package, and then displays
"Reject" if any dimension is greater than 10, and "Accept" if all the dimensions are less than or equal to 10.

Author: Youssef Mohammed, 
School: CHHS
Course: Computer Programming 20

*/

package Skillbuilders;

import java.util.Scanner;

public class Delivery 
{
	
    public static void main(String[] args) 
    {
    	
        Scanner scanner = new Scanner(System.in);

        // Input: Dimensions of the package
        System.out.print("Enter the length of the package: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the package: ");
        double width = scanner.nextDouble();

        System.out.print("Enter the height of the package: ");
        double height = scanner.nextDouble();

        // Check if any dimension is greater than 10
        if (length > 10 || width > 10 || height > 10) {
            System.out.println("Reject");
        } else {
            System.out.println("Accept");
        }

        scanner.close();
    }
}

/* Screen Dump

Enter the length of the package: 2
Enter the width of the package: 1
Enter the height of the package: 4
Accept
 
 */