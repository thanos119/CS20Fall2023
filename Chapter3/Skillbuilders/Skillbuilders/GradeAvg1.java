/*

Program: GradeAvg.java          Last Date of this Revision: September 29, 2023

Purpose: An application that prompts the user for five grades and then displays the average of 
those grades.

Author: Youssef Mohammed, 
School: CHHS
Course: Computer Programming 20
 
*/

package Skillbuilders;

import java.util.Scanner;

public class GradeAvg1 
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

        // Calculates the average of the grades.
        double average = (double) total / 5;

        // Displays the average for the user to see.
        System.out.println("Average grade: " + average);

        scanner.close();
    }
}

/* Screen Dump

Enter five integer grades:
Grade 1: 56
Grade 2: 80
Grade 3: 40
Grade 4: 85
Grade 5: 90
Average grade: 70.2
 
 */