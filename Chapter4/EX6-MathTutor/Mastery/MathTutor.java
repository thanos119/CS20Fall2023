/*

Program: MathTutor.java          Last Date of this Revision: September 29, 2023

Purpose: An application that displays math problems by randomly generating two numbers, 1 through
10 and an operator (*,-,+,/), and then prompts the user for an answer.

Author: Youssef Mohammed, 
School: CHHS
Course: Computer Programming 20

*/
package Mastery;

import java.util.Random;
import java.util.Scanner;

public class MathTutor 
{
	
    public static void main(String[] args) 
    {
    	
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int num1, num2, answer;
        char operator;
        int correctAnswers = 0;
        int totalQuestions = 5; // Number of math problems to generate

        System.out.println("Welcome to Math Tutor!");

        for (int i = 1; i <= totalQuestions; i++) {
            // Generate two random numbers between 1 and 10
            num1 = random.nextInt(10) + 1;
            num2 = random.nextInt(10) + 1;

            // Generate a random operator (+, -, *, /)
            int operatorChoice = random.nextInt(4);
            switch (operatorChoice) {
                case 0:
                    operator = '+';
                    answer = num1 + num2;
                    break;
                case 1:
                    operator = '-';
                    answer = num1 - num2;
                    break;
                case 2:
                    operator = '*';
                    answer = num1 * num2;
                    break;
                default:
                    operator = '/';
                    answer = num1 / num2;
                    break;
            }

            System.out.print("Question " + i + ": " + num1 + " " + operator + " " + num2 + " = ");
            int userAnswer = scanner.nextInt();

            // Check the user's answer
            if (userAnswer == answer) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("Incorrect. The correct answer is: " + answer);
            }
        }

        // Display the final score
        System.out.println("Your score: " + correctAnswers + " out of " + totalQuestions);

        scanner.close();
    }
}


/* Screen Dump

Welcome to Math Tutor!
Question 1: 10 * 5 = 15
Incorrect. The correct answer is: 50
Question 2: 4 - 6 = -2
Correct!
Question 3: 6 / 6 = 
 
 */