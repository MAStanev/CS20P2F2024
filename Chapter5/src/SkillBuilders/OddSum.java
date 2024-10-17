package SkillBuilders;

import java.util.Scanner;

public class OddSum {

	public static void main(String[] args) {

		Scanner userinput = new Scanner (System.in);

		
		int Digit = 0;

		
		System.out.print("Enter a number: ");

		int Number = userinput.nextInt();

					

		for (int i = 1; i<=Number; i+=2) {

		Digit += i;}

				
		System.out.println("Sum of the odd numbers of " + Number +  " are "+ Digit);
		
	
	}

}
