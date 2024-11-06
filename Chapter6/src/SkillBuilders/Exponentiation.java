package SkillBuilders;

import java.util.Scanner;

public class Exponentiation {

public static void powerOf(int Base, int Exponent) //Create power of method with two parameters
{
Scanner userInput = new Scanner(System.in); // Create scanner object
		
double result = Math.pow(Base, Exponent); // Use powerOf object
System.out.println(Base + " to the power of " + Exponent + " = " + result); // Will output the equation and the answer
}

public static void main(String[] args) {
		
Scanner userInput = new Scanner(System.in); // Creates scanner object

System.out.println("Choose which number you would like to be the base: "); // Prompt user for the base of the exponent
int Base = userInput.nextInt();

System.out.println("Choose which number you would like to be the exponent: "); // Prompts user for exponent
int Exponent = userInput.nextInt();

powerOf(Base, Exponent); // Calls on powerOf method to print the equation and the answer


			}		
		

}
