package SkillBuilders;

import java.util.Scanner;


public class Delivery 
{

	public static void main(String[] args)
{

		Scanner Userinput = new Scanner (System.in);

		
System.out.print("What is the length of your package: ");
int length = Userinput.nextInt();

System.out.print("What is the width of your package: ");
int width = Userinput.nextInt();


System.out.print("What is the height of your package: ");
int height = Userinput.nextInt();


if ((length > 10) || (width > 10) || (height > 10)) {
	System.out.print("REJECTED | One of your dimensions is greater than 10");
	
}	
	
else if ((length <= 10) && (width <= 10) && (height <= 10)) {
	System.out.print("ACCEPTED | Your package has been sent for delivery!");
}
}
}