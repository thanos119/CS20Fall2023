/*

Program: Delivery.java          Last Date of this Revision: October 7, 2023

Purpose: An application that prompts the user for his or her name and then displays a group assignment.

Author: Youssef Mohammed, 
School: CHHS
Course: Computer Programming 20

*/
package Mastery;

import java.util.Scanner;

public class GroupAssignment 
{
	
    public static void main(String[] args) 
    {
    	
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine().trim(); // Trim any leading/trailing spaces.

        // Extracts the last name by splitting the full name.
        String[] nameParts = fullName.split(" ");
        String lastName = "";
        if (nameParts.length > 0) {
            lastName = nameParts[nameParts.length - 1];
        }

        // This code sets the "firstLetterOfLastName" variable to the first character of the lastName if "lastName" is not empty. If "lastName" is empty, it sets "firstLetterOfLastName" to a space character. The groupNumber variable is declared. 
        char firstLetterOfLastName = lastName.isEmpty() ? ' ' : lastName.charAt(0);
        int groupNumber;

        // Assigns the group based on the first letter of the last name. Determined by conditions.
        if (firstLetterOfLastName >= 'A' && firstLetterOfLastName <= 'I') {
            groupNumber = 1;
        } else if (firstLetterOfLastName >= 'J' && firstLetterOfLastName <= 'S') {
            groupNumber = 2;
        } else if (firstLetterOfLastName >= 'T' && firstLetterOfLastName <= 'Z') {
            groupNumber = 3;
        } else {
            groupNumber = 0; // If it's an invalid last name.
        }

        // Tells the user if the letter is valid or not. If it is valid, it'll introduce the user to the assignment.
        if (groupNumber == 0) {
            System.out.println("Invalid last name. Please enter a valid last name.");
        } else {
            System.out.println("Hello, " + fullName + "! You are assigned to Group " + groupNumber + ".");
        }

        scanner.close();
    }
}

/* Screen Dump

Enter your full name: Youssef Mohammed
Hello, Youssef Mohammed! You are assigned to Group 2.

 */