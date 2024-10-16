package Mastery;

import java.util.Scanner;


public class QuadraticEquations {

	public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
System.out.print("Enter the value for a: ");
int aValue = userInput.nextInt();
System.out.print("Enter the value for b: ");
int bValue = userInput.nextInt();
System.out.print("Enter the value for c: ");
int cValue = userInput.nextInt();

double root1 = (-bValue + Math.sqrt(bValue*bValue-4*aValue*cValue))/(2*aValue);
double root2 = (-bValue - Math.sqrt(bValue*bValue-4*aValue*cValue))/(2*aValue);

System.out.print("The roots are " + root1 + " and " + root2);
	}

}
