package Mastery;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner Userinput = new Scanner (System.in);
System.out.print("Enter a three digit number: ");
int digitnumber = Userinput.nextInt();


int HundredsDefiner = (digitnumber / 100 * 100); // Tell the computer what's in the hundreds place
int DoubleDigit = digitnumber - HundredsDefiner; // Remove the hundreds place
int hundreds = digitnumber / 100;
int tens = DoubleDigit / 10;
int ones = DoubleDigit % 10;
System.out.println("In the hundreds place of the number " + digitnumber + " is: " + hundreds);
System.out.println("In the tens place of the number " + digitnumber + " is: " + tens);
System.out.println("In the ones place of the number " + digitnumber + " is: " + ones);
	}

}
