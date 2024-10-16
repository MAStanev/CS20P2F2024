
/*

Program: MathTutor.java          Last Date of this Revision: October 16, 2024

Purpose: Displays math problems by randomly generating two numbers, 1-10,
 and lets the user pick an operator, and then prompts the user for an answer.

Author: Misha Stanev 
School: CHHS
Course: Computer Programming 20

*/


package Mastery;


import java.text.DecimalFormat;
import java.util.Scanner;


public class MathTutor {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("0.0");
        // Generates random number 1-10
        int firstNum = (int) (Math.random() * 11);
        int secondNum = (int) (Math.random() * 11);

        // Asks user which operator they would like to use
        System.out.println("Choose the number of which operator you would like to use: ");
        System.out.println("1. +");
        System.out.println("2. -");
        System.out.println("3. /");
        System.out.println("4. *");

        int operatorChoice = userInput.nextInt();
        
        
        String operatorSymbol = ""; 
        double result = 0.0;

        // Switch case depending on which operator user entered
        switch (operatorChoice) {
            case 1:
                operatorSymbol = "+";
                result = firstNum + secondNum;
                break;
            case 2:
                operatorSymbol = "-";
                result = firstNum - secondNum;
                break;
            case 3:
                operatorSymbol = "/";
                if (secondNum == 0) {
                    System.out.println("Cannot divide by zero.");
                    break;
                }
                result = (double) firstNum / (double) secondNum; 
                break;
            case 4:
                operatorSymbol = "*";
                result = firstNum * secondNum; 
                break;
            default:
                System.out.println("Invalid operator selected.");
        }

        // Outputs mathematical equation for user
        System.out.println("Round to the nearest tenth if necessary");
        System.out.print("What is: " + firstNum + " " + operatorSymbol + " " + secondNum + " =  ?");
        
        // Gathers users answer 
        double userAnswer = userInput.nextDouble();

        // Compares users answer with result, if correct prints "Correct!" if incorrect prints "Incorrect! The answer was _"
       String finalS = dc.format(result);
        double finalAns = Double.parseDouble(finalS);
        if (userAnswer == finalAns )
            System.out.print("Correct!");
        else {
            System.out.print("Incorrect! The answer was " + finalAns);
        }

    }
}


/* Screen Dump

Paste the output of your code here
 Choose the number of which operator you would like to use: 
1. +
2. -
3. /
4. *
1
Round to the nearest tenth if necessary
What is: 6 + 6 =  ?12
Correct!

Choose the number of which operator you would like to use: 
1. +
2. -
3. /
4. *
3
Round to the nearest tenth if necessary
What is: 12 / 3 =  ?5
Incorrect! The answer was 4

 */