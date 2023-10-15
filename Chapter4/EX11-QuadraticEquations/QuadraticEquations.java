/*

Program: QuadraticEquations.java          Last Date of this Revision: September 29, 2023

Purpose: An application that gives the solution to any quadratic equation.

Author: Youssef Mohammed, 
School: CHHS
Course: Computer Programming 20

*/

import java.util.Scanner;

public class QuadraticEquations 
{
	
    public static void main(String[] args)
    {
    	
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quadratic Equation Solver");
        System.out.println("=========================");

        // Prompting the user for values of a, b, and c.
        System.out.print("Enter value for a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter value for b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter value for c: ");
        double c = scanner.nextDouble();

        // Calculating the discriminant by using (D = b^2 - 4ac).
        double discriminant = b * b - 4 * a * c;

        // Calculating the two real and distinct roots.
        if (discriminant > 0) {           
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.println("The roots are " + root1 + " and " + root2);
        } else if (discriminant == 0) {
            // One real root (double root).
            double root = -b / (2 * a);
            System.out.println("The root is " + root);
        } else {
            // This is for complex roots.
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);

            System.out.println("The roots are " + realPart + " + " + imaginaryPart + "i" +
                    " and " + realPart + " - " + imaginaryPart + "i");
        }

        scanner.close();
    }
}



/* Screen Dump

Quadratic Equation Solver
=========================
Enter value for a: 2
Enter value for b: 4
Enter value for c: -30
The roots are 3.0 and -5.0

 */