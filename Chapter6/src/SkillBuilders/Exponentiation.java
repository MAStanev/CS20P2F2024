package SkillBuilders;

import java.util.Scanner;

public class Exponentiation {

	public static void powerOf() {

Scanner userInput = new Scanner(System.in);
		
		
System.out.println("Choose which number you would like to be the base: ");
int Base = userInput.nextInt();

System.out.println("Choose which number you would like to be the exponent: ");
int Exponent = userInput.nextInt();

double result = Math.pow(Base, Exponent);
System.out.println(Base + " to the power of " + Exponent + " = " + result);
	}
	public static void main(String[] args) {
powerOf();	
powerOf();
}
}