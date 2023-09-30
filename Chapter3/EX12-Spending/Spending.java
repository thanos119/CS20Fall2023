/*

Program: Spending.java          Last Date of this Revision: September 29, 2023

Purpose: An application the collects the spends of the user and calculating the total to percentages showing the 
user how much she spend for each category. 

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

        // Making the title of the program.
        System.out.println("Spending Analysis for Last Month");
        System.out.println("=================================");

        // Prompting the user for their spends in different categories (food, clothing, entertainment, and rent.
        System.out.print("Amount spent on Food (in USD): ");
        double foodSpending = scanner.nextDouble();

        System.out.print("Amount spent on Clothing (in USD): ");
        double clothingSpending = scanner.nextDouble();

        System.out.print("Amount spent on Entertainment (in USD): ");
        double entertainmentSpending = scanner.nextDouble();

        System.out.print("Amount spent on Rent (in USD): ");
        double rentSpending = scanner.nextDouble();

        // Calculating the total spending of the user.
        double totalSpending = foodSpending + clothingSpending + entertainmentSpending + rentSpending;

        // Calculating the total to percentages.
        double foodPercentage = (foodSpending / totalSpending) * 100;
        double clothingPercentage = (clothingSpending / totalSpending) * 100;
        double entertainmentPercentage = (entertainmentSpending / totalSpending) * 100;
        double rentPercentage = (rentSpending / totalSpending) * 100;

        // Displaying the results in a table for the user to see.
        System.out.println("\nSpending Analysis Report");
        System.out.println("========================");
        System.out.println("Category        Amount (USD)      Percentage");
        System.out.println("--------------------------------------------");
        System.out.printf("Food            %.2f               %.2f%%\n", foodSpending, foodPercentage);
        System.out.printf("Clothing        %.2f               %.2f%%\n", clothingSpending, clothingPercentage);
        System.out.printf("Entertainment   %.2f               %.2f%%\n", entertainmentSpending, entertainmentPercentage);
        System.out.printf("Rent            %.2f               %.2f%%\n", rentSpending, rentPercentage);
        System.out.println("--------------------------------------------");
        System.out.printf("Total           %.2f               100.00%%\n", totalSpending);

        scanner.close();
    }
}

/* Screen Dump

Spending Analysis for Last Month
=================================
Amount spent on Food (in USD): 20
Amount spent on Clothing (in USD): 30
Amount spent on Entertainment (in USD): 40
Amount spent on Rent (in USD): 20

Spending Analysis Report
========================
Category        Amount (USD)      Percentage
--------------------------------------------
Food            20.00               18.18%
Clothing        30.00               27.27%
Entertainment   40.00               36.36%
Rent            20.00               18.18%
--------------------------------------------
Total           110.00               100.00%
 
 */