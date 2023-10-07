/*

Program: PrimeNumber.java          Last Date of this Revision: October 7, 2023

Purpose: An application that prompts the user for a number and then displays a message indicating, 
whether number is prime or not.

Author: Youssef Mohammed, 
School: CHHS
Course: Computer Programming 20

*/

import java.util.Scanner;

public class PrimeNumber 
{
	
    public static void main(String[] args) 
    {
    	
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is prime
        boolean isPrime = isPrimeNumber(number);

        // Display the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }

    // Function to check if a number is prime
    public static boolean isPrimeNumber(int n) {
        if (n <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        if (n <= 3) {
            return true; // 2 and 3 are prime numbers
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false; // Numbers divisible by 2 or 3 are not prime
        }

        // Check for prime using 6k +/- 1 rule
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}

/* Screen Dump

Enter a number: 5
5 is a prime number.

 */