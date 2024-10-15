package SkillBuilders;

import java.util.Scanner;
import java.lang.Math;

public class RandomNum 

{

	public static void main(String[] args) 	
{

		Scanner Userinput = new Scanner(System.in);

System.out.println("Please enter two numbers. The first number will be the minimum value and the second number is the maximum value.");
		
System.out.println("Enter your minimum value: ");		
int lowNum = Userinput.nextInt();

System.out.print("Enter your maximum value: ");
int highNum = Userinput.nextInt();



	System.out.print((int) ((highNum - lowNum + 1) * Math.random() + lowNum));

		
}

}
