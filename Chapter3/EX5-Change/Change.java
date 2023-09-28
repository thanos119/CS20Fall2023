/*

Program: Change.java          Last Date of this Revision: September 28, 2023

Purpose: An application that displays how many coins needed by what the user inputed any amount below $1.00. 

Author: Youssef Mohammed, 
School: CHHS
Course: Computer Programming 20
 
*/

import java.util.Scanner;


public class Change 
{
    
	public static void main(String[] args) 
	{
        
		Scanner scanner = new Scanner(System.in);
        
		// Asking the user to input an amount less than $1.00
		
        System.out.print("Enter an amount less than $1.00: ");
        double amount = scanner.nextDouble();
        
        // If the user types an amount more than $1.00 than it'll display a message letting the user know it must be below than $1.00
        
        if (amount >= 1.00) {
            System.out.println("Amount must be less than $1.00");
            return;
        }
        
        // Setting the amount for each coin (quarters, dimes, nickels, pennies), so the program knows that coins to display for the specific amount inputed.
        
        int cents = (int) (amount * 100); // Convert dollars to cents
        
        int quarters = cents / 25;
        cents %= 25;
        
        int dimes = cents / 10;
        cents %= 10;
        
        int nickels = cents / 5;
        cents %= 5;
        
        int pennies = cents;
        
        // Finally, the once the program is finished selecting the coins for the specific amount inputed, it'll display on screen letting know the user what coins they need.
        
        System.out.println("Minimum number of coins:");
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);
        
        scanner.close();
    }
}

/* Screen Dump

Enter an amount less than $1.00: 0.20
Minimum number of coins:
Quarters: 0
Dimes: 2
Nickels: 0
Pennies: 0
 
 */