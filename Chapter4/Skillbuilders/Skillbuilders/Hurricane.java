/*

Program: Hurricane.java          Last Date of this Revision: September 29, 2023

Purpose: An application that displays the wind speed for the hurricane category entered by the user.

Author: Youssef Mohammed, 
School: CHHS
Course: Computer Programming 20

*/

package Skillbuilders;

import java.util.Scanner;

public class Hurricane 
{
	
    public static void main(String[] args) 
    {
    	
        Scanner scanner = new Scanner(System.in);

        // Define the Saffir-Simpson Hurricane Scale categories and their wind speeds in mph
        int[] mphSpeeds = {74, 96, 111, 130, 157};

        // Input: Hurricane category
        System.out.print("Enter the hurricane category (1-5): ");
        int category = scanner.nextInt();

        if (category >= 1 && category <= 5) {
            int mphSpeed = mphSpeeds[category - 1];

            // Calculate wind speed in knots (1 knot = 1.15078 mph) and km/hr (1 mph = 1.60934 km/hr)
            double knotsSpeed = mphSpeed / 1.15078;
            double kmPerHourSpeed = mphSpeed * 1.60934;

            // Display wind speeds
            System.out.println("Wind Speed for Category " + category + ":");
            System.out.println("Miles per Hour (mph): " + mphSpeed);
            System.out.println("Knots (kts): " + knotsSpeed);
            System.out.println("Kilometers per Hour (km/hr): " + kmPerHourSpeed);
        } else {
            System.out.println("Invalid category. Please enter a category between 1 and 5.");
        }

        scanner.close();
    }
}

/* Screen Dump

Enter the hurricane category (1-5): 2
Wind Speed for Category 2:
Miles per Hour (mph): 96
Knots (kts): 83.42167920888441
Kilometers per Hour (km/hr): 154.49664
 
 */