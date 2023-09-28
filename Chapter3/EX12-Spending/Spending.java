/*

Program: Spending.java          Last Date of this Revision: September 27, 2023

Purpose: An application collects orders, calculates the amount + tax, prompts it to the user and as well as calculating change.

Author: Youssef Mohammed, 
School: CHHS
Course: Computer Programming 20

*/

import java.util.Scanner;

public class Spending 
{
    public static void main(String[] args) 
    {
    	
        Scanner scanner = new Scanner(System.in);

        System.out.println("Time Analysis for Your Java Project");
        System.out.println("===================================");

        // Prompt the user for time spent on different phases
        System.out.print("Time spent on Design (in hours): ");
        double designTime = scanner.nextDouble();

        System.out.print("Time spent on Coding (in hours): ");
        double codingTime = scanner.nextDouble();

        System.out.print("Time spent on Debugging (in hours): ");
        double debuggingTime = scanner.nextDouble();

        System.out.print("Time spent on Testing (in hours): ");
        double testingTime = scanner.nextDouble();

        // Calculate the total time
        double totalTime = designTime + codingTime + debuggingTime + testingTime;

        // Calculate the percentages
        double designPercentage = (designTime / totalTime) * 100;
        double codingPercentage = (codingTime / totalTime) * 100;
        double debuggingPercentage = (debuggingTime / totalTime) * 100;
        double testingPercentage = (testingTime / totalTime) * 100;

        // Display the results in a table
        System.out.println("\nTime Analysis Report");
        System.out.println("====================");
        System.out.println("Phase          Time (hours)      Percentage");
        System.out.println("------------------------------------------");
        System.out.printf("Design         %.2f               %.2f%%\n", designTime, designPercentage);
        System.out.printf("Coding         %.2f               %.2f%%\n", codingTime, codingPercentage);
        System.out.printf("Debugging      %.2f               %.2f%%\n", debuggingTime, debuggingPercentage);
        System.out.printf("Testing        %.2f               %.2f%%\n", testingTime, testingPercentage);
        System.out.println("------------------------------------------");
        System.out.printf("Total          %.2f               100.00%%\n", totalTime);

        scanner.close();
    }
}

/* Screen Dump

Enter the number of Burgers: 2
Enter the number of Fries: 1
Enter the number of Sodas: 1
Total before tax: $5.46
Tax (6.5%): $0.35
Final cost: $5.81
Enter the amount tendered: $6.00
Change due: $0.19
 
 */

