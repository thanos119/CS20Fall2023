/*

Program: Order.java          Last Date of this Revision: September 27, 2023

Purpose: An application collects orders, calculates the amount + tax, prompts it to the user and as well as calculating change.

Author: Youssef Mohammed, 
School: CHHS
Course: Computer Programming 20

*/

import java.util.Scanner;

public class Order 
{
	
    public static void main(String[] args) 
    {
    	
        Scanner scanner = new Scanner(System.in);

        // Prices
        double burgerPrice = 1.69;
        double friesPrice = 1.09;
        double sodaPrice = 0.99;

        // Input: Number of items ordered
        System.out.print("Enter the number of Burgers: ");
        int numBurgers = scanner.nextInt();

        System.out.print("Enter the number of Fries: ");
        int numFries = scanner.nextInt();

        System.out.print("Enter the number of Sodas: ");
        int numSodas = scanner.nextInt();

        // Calculate total cost before tax
        double subtotal = (numBurgers * burgerPrice) + (numFries * friesPrice) + (numSodas * sodaPrice);

        // Calculate tax (6.5%)
        double taxRate = 0.065;
        double tax = subtotal * taxRate;

        // Calculate final cost
        double totalCost = subtotal + tax;

        // Output: Display the total, tax, and final cost
        System.out.println("Total before tax: $" + String.format("%.2f", subtotal));
        System.out.println("Tax (6.5%): $" + String.format("%.2f", tax));
        System.out.println("Final cost: $" + String.format("%.2f", totalCost));

        // Part b) Input: Amount tendered
        System.out.print("Enter the amount tendered: $");
        double amountTendered = scanner.nextDouble();

        // Calculate change due
        double changeDue = amountTendered - totalCost;

        // Output: Display the change due
        System.out.println("Change due: $" + String.format("%.2f", changeDue));

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
