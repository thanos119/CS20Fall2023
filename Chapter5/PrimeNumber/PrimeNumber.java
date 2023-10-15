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

        // Prompt the user for a number.
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Determining whether the number is prime or not. It calculates if the number can only be divided by 1 and itself without any remainder.
        boolean isPrime = isPrimeNumber(number);

        // Displays the result if the following number is prime or not.
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }

    // Function and conditions to check if a number is prime. Basically double checking.
    public static boolean isPrimeNumber(int n) { //Grabbing the exact value of "isPrimeNumber" either "true" or "false" from the same class.
        if (n <= 1) {
            return false; // Numbers less than or equal to 1 are not prime (false).
        }
        if (n <= 3) {
            return true; // 2 and 3 are prime numbers (true).
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false; // Numbers divisible by 2 or 3 are not prime (false).
        }

        // Checks for prime using 6k +/- 1 rule.
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