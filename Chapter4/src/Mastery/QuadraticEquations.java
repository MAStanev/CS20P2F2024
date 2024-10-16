/*

Program: QuadraticEquations.java          Last Date of this Revision: October 16, 2024

Purpose: Gives the solution to any quadratic equation.

Author: Misha Stanev 
School: CHHS
Course: Computer Programming 20
 

*/


package Mastery;

import java.util.Scanner;


public class QuadraticEquations {

	public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
System.out.print("Enter the value for a: ");
double aValue = userInput.nextDouble();
System.out.print("Enter the value for b: ");
double bValue = userInput.nextDouble();
System.out.print("Enter the value for c: ");
double cValue = userInput.nextDouble();

double root1 = (-bValue + (int)Math.sqrt(bValue*bValue-4*aValue*cValue))/(2*aValue);
double root2 = (-bValue - (int)Math.sqrt(bValue*bValue-4*aValue*cValue))/(2*aValue);

System.out.print("The roots are " + root1 + " and " + root2);
	}

}


/* Screen Dump

Paste the output of your code here
 
 Enter the value for a: 2
Enter the value for b: 4
Enter the value for c: -30
The roots are 3.0 and -5.0
 
 */