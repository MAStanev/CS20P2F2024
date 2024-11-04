/*

Program: MetricConversion.java          Last Date of this Revision: October 31, 2024

Purpose: An application that displays a menu of conversion choices and then prompts the user to choose a conversion.

Author: Misha Stanev 
School: CHHS
Course: Computer Programming 20
 

*/

package Masterys;

import java.util.Scanner;

public class MetricConversion {
    
    static void conversions() {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Convert:"); // Prompt user for conversion choice and store it as conversionChoice
        System.out.println("1. Inches to Centimeters        5. Centimeters to Inches");
        System.out.println("2. Feet to Centimeters          6. Centimeters to Feet");
        System.out.println("3. Yards to Meters              7. Meters to Yards");
        System.out.println("4. Miles to Kilometers          8. Kilometers to Miles");
        System.out.print("Enter your choice: ");
        int conversionChoice = userInput.nextInt();

        if (conversionChoice == 1) { // Accounts for if user entered 1 for their conversion choice
            System.out.print("How many inches? ");
            double inches = userInput.nextDouble();
            double centimeters = inches * 2.54;
            System.out.print(inches + " inches equals " + centimeters + " centimeters.");
        }
        else if (conversionChoice == 2) { // Accounts for if user entered 2 for their conversion choice
            System.out.print("How many feet? ");
            double Feet = userInput.nextDouble();
            double Centimeters = Feet * 30;
            System.out.print(Feet + " feet equals " + Centimeters + " centimeters.");
        }
        else if (conversionChoice == 3) { // Accounts for if user entered 3 for their conversion choice
            System.out.print("How many yards? ");
            double Yards = userInput.nextDouble();
            double Meters = Yards * 0.91;
            System.out.print(Yards + " yards equals " + Meters + " meters.");
        }
        else if (conversionChoice == 4) { // Accounts for if user entered 4 for their conversion choice
            System.out.print("How many miles? ");
            double Miles = userInput.nextDouble();
            double Kilometers = Miles * 1.6;
            System.out.print(Miles + " miles equals " + Kilometers + " kilometers.");
        }
        else if (conversionChoice == 5) { // Accounts for if user entered 5 for their conversion choice
            System.out.print("How many centimeters? ");
            double Centimeters = userInput.nextDouble();
            double Inches = Centimeters / 2.54;
            System.out.print(Centimeters + " centimeters equals " + Inches + " inches.");
        }
        else if (conversionChoice == 6) { // Accounts for if user entered 6 for their conversion choice
            System.out.print("How many centimeters? ");
            double Centimeters = userInput.nextDouble();
            double Feet = Centimeters / 30;
            System.out.print(Centimeters + " centimeters equals " + Feet + " feet.");
        }
        else if (conversionChoice == 7) { // Accounts for if user entered 7 for their conversion choice
            System.out.print("How many meters? ");
            double Meters = userInput.nextDouble();
            double Yards = Meters * 1.094;
            System.out.print(Meters + " meters equals " + Yards + " yards.");
        }
        else if (conversionChoice == 8) { // Accounts for if user entered 8 for their conversion choice
            System.out.print("How many kilometers? ");
            double Kilometers = userInput.nextDouble();
            double Miles = Kilometers / 1.6;
            System.out.print(Kilometers + " kilometers equals " + Miles + " miles.");
        }

        else { // Accounts for if user enters a character that is not 1-8
        	System.out.print("Invalid input | Please choose a number 1-8");
        }
    }

    public static void main(String[] args) {
        conversions(); // Calls upon the conversions() method
    }
}

/* Screen Dump

Convert:
1. Inches to Centimeters        5. Centimeters to Inches
2. Feet to Centimeters          6. Centimeters to Feet
3. Yards to Meters              7. Meters to Yards
4. Miles to Kilometers          8. Kilometers to Miles
Enter your choice: 2
How many feet? 4
4.0 feet equals 120.0 centimeters.
 
 */
