package SkillBuilders;

import java.util.Scanner; // Import scanner

public class Digits {

	public static void main(String[] args) {
		Scanner Userinput = new Scanner (System.in);
System.out.print("Enter a two digit number: ");
int digitnumber = Userinput.nextInt();


int tens = digitnumber / 10;
int ones = digitnumber % 10;
System.out.println("In the tens place of the number " + digitnumber + " is: " + tens);
System.out.println("In the ones place of the number " + digitnumber + " is: " + ones);
}

}

