/*

Program: PrimeNumber.java          Last Date of this Revision: October 18, 2024

Purpose: An application that prompts the user for a number and then displays a message indicating whether the number is prime or not.

Author: Misha Stanev 
School: CHHS
Course: Computer Programming 20
 

*/


package Masterys;

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
		
/* Screen Dump

Paste the output of your code here

Enter a number:3
Your number is a prime number
 

Enter a number:8
Your number isnt a prime number
 
 */