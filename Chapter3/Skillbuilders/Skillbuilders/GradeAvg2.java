/*

Program: GradeAvg2.java          Last Date of this Revision: September 29, 2023

Purpose: An application that prompts the user for five grades and then displays the average as
a percentage.

Author: Youssef Mohammed, 
School: CHHS
Course: Computer Programming 20
 
*/

package Skillbuilders;

import java.util.Scanner;

public class GradeAvg2 
{
	
    public static void main(String[] args) 
    {
    	
        Scanner scanner = new Scanner(System.in);

        // Prompts the user to input the five grades.
        System.out.println("Enter five integer grades:");

        // Adding all the grades inputed by the user.
        int total = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Grade " + i + ": ");
            int grade = scanner.nextInt();
            total += grade;
        }

        // Calculates the average as a percentage.
        double average = (double) total / 5;
        String formattedAverage = String.format("%.2f%%", average);

        // Displays the average as a percentage for the user to see.
        System.out.println("Average grade: " + formattedAverage);

        scanner.close();
    }
}

/* Screen Dump

Enter five integer grades:
Grade 1: 20
Grade 2: 50
Grade 3: 90
Grade 4: 80
Grade 5: 40
Average grade: 56.00%
 
 */