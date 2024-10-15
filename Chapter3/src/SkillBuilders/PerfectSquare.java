package SkillBuilders;

import java.util.Scanner;

public class PerfectSquare 
{

	public static void main(String[] args) 
	
{

		int UserInput;
		int squaredNum;
		double squareRoot;
			
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter an integer: ");
		UserInput = input.nextInt();

		squareRoot = Math.sqrt(UserInput);
		
		squaredNum = (int)Math.pow(squareRoot, 2);
		
		if(UserInput == squaredNum)
		{
			System.out.println("The number you entered is a perfect square");
		}
		else
		{
			System.out.println("The number you entered is not a perfect square");
		}


}

}
