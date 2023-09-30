/*

Program: RectanglePerimeter.java          Last Date of this Revision: September 29, 2023

Purpose: An application that calculates the perimeter with the width of 4 and length of 13.

Author: Youssef Mohammed, 
School: CHHS
Course: Computer Programming 20
 
*/

package Skillbuilders;

public class RectanglePerimeter 
{
	
    public static void main(String[] args) 
    {
    	
        // Defining the width and length of the rectangle.
        double width = 4;
        double length = 13;

        // Calculating the perimeter using the formula: 2 * width + 2 * length.
        double perimeter = 2 * width + 2 * length;

        // Displaying the calculated answer of the perimeter.
        System.out.println("Perimeter of the rectangle:");
        System.out.println("Width: " + width);
        System.out.println("Length: " + length);
        System.out.println("Perimeter: " + perimeter);
    }
}

/* Screen Dump

Perimeter of the rectangle:
Width: 4.0
Length: 13.0
Perimeter: 34.0

 */