package Mastery;

import java.text.NumberFormat;

import java.util.Scanner;

public class Project 
{

	public static void main(String[] args) 
	{
		NumberFormat nf = NumberFormat.getPercentInstance();
		
		Scanner Userinput = new Scanner (System.in);
		System.out.print("How many minutes did you spend on Designing?: ");
		int Designing = Userinput.nextInt();
		System.out.print("How many minutes did you spend on Coding?: ");
		int Coding = Userinput.nextInt();
		System.out.print("How many minutes did you spend on Debugging?: ");
		int Debugging = Userinput.nextInt();
		System.out.print("How many minutes did you spend on Testing?: ");
		int Testing = Userinput.nextInt();
		
		double TimeTotal = Designing + Coding + Debugging + Testing;
		
		double PercentageDesign = Designing / TimeTotal * 100;
		double PercentageCoding = Coding / TimeTotal * 100;
		double PercentageDebugging = Debugging / TimeTotal * 100;
		double PercentageTesting = Testing / TimeTotal * 100;

		System.out.println(" ");
		System.out.println("The percentage of time spent doing each task is: ");
		System.out.println(" ");

		System.out.println("Task          Time %");
		System.out.println("Designing     " + nf.format(PercentageDesign/100));
		System.out.println("Coding        " + nf.format(PercentageCoding/100));
		System.out.println("Debugging     " + nf.format(PercentageDebugging/100));
		System.out.println("Testing       " + nf.format(PercentageTesting/100));
		


				
				
		
		
	}

}
