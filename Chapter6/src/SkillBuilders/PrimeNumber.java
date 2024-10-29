
package SkillBuilders;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		int Digit = 0;
		Scanner userinput = new Scanner (System.in);
		
		System.out.print("Enter a number:");
		int Number = userinput.nextInt();

		for (int i = 1; i<=Number; i+=1) {
			if (Number % i == 0) { 
				Digit += 1;
			} }
if (Digit == 2) {
	System.out.print("Your number is a prime number");
			}
else {
	System.out.print("Your number isnt a prime number");
			}
		}
	}