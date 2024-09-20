package Mastery;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner Userinput = new Scanner (System.in);
System.out.print("Enter a three digit number: ");
int digitnumber = Userinput.nextInt();

int hundreds = digitnumber / 100;
int HundredsDefiner = (digitnumber / 100 * 100);
int DoubleDigit = digitnumber - HundredsDefiner;
int tens = DoubleDigit / 10;
int ones = DoubleDigit % 10;
System.out.println("In the hundredss place of the number " + digitnumber + " is: " + hundreds);
System.out.println("In the tens place of the number " + digitnumber + " is: " + tens);
System.out.println("In the ones place of the number " + digitnumber + " is: " + ones);
	}

}
