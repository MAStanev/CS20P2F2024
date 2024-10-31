package SkillBuilders;

import java.util.Scanner;

public class Test {
    
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
            System.out.print("How many centimeters? ");
            double centimeters = userInput.nextDouble();
            double inches = centimeters / 2.54;
            System.out.print(centimeters + " centimeters equals " + inches + " inches.");
        }
        if (conversionChoice == 3) {
            System.out.print("How many feet? ");
            double feet = userInput.nextDouble();
            double centimeters = feet * 30;
            System.out.print(feet + " feet equals " + centimeters + " centimeters.");
        }
        if (conversionChoice == 4) {
            System.out.print("How many miles? ");
            double miles = userInput.nextDouble();
            double kilometers = miles * 1.6;
            System.out.print(miles + " miles equals " + kilometers + " kilometers.");
        }
        if (conversionChoice == 5) {
            System.out.print("How many centimeters? ");
            double centimeters = userInput.nextDouble();
            double feet = centimeters / 30;
            System.out.print(centimeters + " centimeters equals " + feet + " feet.");
        }
        if (conversionChoice == 6) {
            System.out.print("How many centimeters? ");
            double centimeters = userInput.nextDouble();
            double inches = centimeters / 2.54;
            System.out.print(centimeters + " centimeters equals " + inches + " inches.");
        }
        if (conversionChoice == 7) {
            System.out.print("How many meters? ");
            double meters = userInput.nextDouble();
            double yards = meters / 0.91;
            System.out.print(meters + " meters equals " + yards + " yards.");
        }
        if (conversionChoice == 8) {
            System.out.print("How many kilometers? ");
            double kilometers = userInput.nextDouble();
            double miles = kilometers / 1.6;
            System.out.print(kilometers + " kilometers equals " + miles + " miles.");
        }

    }

    public static void main(String[] args) {
        conversions();
    }
}
