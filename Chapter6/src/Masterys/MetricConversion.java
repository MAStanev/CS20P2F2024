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

        System.out.println("Convert:");
        System.out.println("1. Inches to Centimeters        5. Centimeters to Inches");
        System.out.println("2. Feet to Centimeters          6. Centimeters to Feet");
        System.out.println("3. Yards to Meters              7. Meters to Yards");
        System.out.println("4. Miles to Kilometers          8. Kilometers to Miles");
        System.out.print("Enter your choice: ");
        int conversionChoice = userInput.nextInt();

        if (conversionChoice == 1) {
            System.out.print("How many inches? ");
            double inches = userInput.nextDouble();
            double centimeters = inches * 2.54;
            System.out.print(inches + " inches equals " + centimeters + " centimeters.");
        }
        if (conversionChoice == 2) {
            System.out.print("How many feet? ");
            double Feet = userInput.nextDouble();
            double Centimeters = Feet * 30;
            System.out.print(Feet + " feet equals " + Centimeters + " centimeters.");
        }
        if (conversionChoice == 3) {
            System.out.print("How many yards? ");
            double Yards = userInput.nextDouble();
            double Meters = Yards * 0.91;
            System.out.print(Yards + " yards equals " + Meters + " meters.");
        }
        if (conversionChoice == 4) {
            System.out.print("How many miles? ");
            double Miles = userInput.nextDouble();
            double Kilometers = Miles * 1.6;
            System.out.print(Miles + " miles equals " + Kilometers + " kilometers.");
        }
        if (conversionChoice == 5) {
            System.out.print("How many centimeters? ");
            double Centimeters = userInput.nextDouble();
            double Inches = Centimeters / 2.54;
            System.out.print(Centimeters + " centimeters equals " + Inches + " inches.");
        }
        if (conversionChoice == 6) {
            System.out.print("How many centimeters? ");
            double Centimeters = userInput.nextDouble();
            double Feet = Centimeters / 30;
            System.out.print(Centimeters + " centimeters equals " + Feet + " feet.");
        }
        if (conversionChoice == 7) {
            System.out.print("How many meters? ");
            double Meters = userInput.nextDouble();
            double Yards = Meters * 1.094;
            System.out.print(Meters + " meters equals " + Yards + " yards.");
        }
        if (conversionChoice == 8) {
            System.out.print("How many kilometers? ");
            double Kilometers = userInput.nextDouble();
            double Miles = Kilometers / 1.6;
            System.out.print(Kilometers + " kilometers equals " + Miles + " miles.");
        }

    }

    public static void main(String[] args) {
        conversions();
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
