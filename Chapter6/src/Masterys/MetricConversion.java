package Masterys;

import java.util.Scanner;

public class MetricConversion {
	
	
	public static void main(String[] args) {

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
	double Inches1 = userInput.nextInt();
	double Centimeters1 = (Inches1) * 2.54;
	System.out.print(Inches1 + " inches equals " + Centimeters1 + " centimeters.");
}
if (conversionChoice == 2) {
	System.out.print("How many feet? ");
	double Feet1 = userInput.nextInt();
	double Centimeters2 = (Feet1) * 30;
	System.out.print(Feet1 + " feet equals " + Centimeters2 + " centimeters.");
}
if (conversionChoice == 3) {
	System.out.print("How many yards? ");
	double Yards1 = userInput.nextInt();
	double Meters1 = (Yards1) * 0.91;
	System.out.print(Yards1 + " yards equals " + Meters1 + " meters.");
}	
if (conversionChoice == 4) {
	System.out.print("How many miles? ");
	double Miles1 = userInput.nextInt();
	double Kilometers1 = (Miles1) * 1.6;
	System.out.print(Miles1 + " miles equals " + Kilometers1 + " kilometers.");
}
if (conversionChoice == 5) {
	System.out.print("How many centimeters? ");
	double Centimeters3 = userInput.nextInt();
	double Inches2 = (Centimeters3) / 2.54;
	System.out.print(Centimeters3 + " centimeters equals " + Inches2 + " inches.");
}
	






}	
}
