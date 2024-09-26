package Mastery;

import java.text.NumberFormat;
import java.util.Scanner;

public class Election 
{

	public static void main(String[] args) {
	
	NumberFormat nf = NumberFormat.getPercentInstance();

{
		Scanner Userinput = new Scanner (System.in);
		System.out.print("What are Awbrey's results in New York:  ");
		int AwbreyNY = Userinput.nextInt();
		System.out.print("What are Awbrey's results in New Jersey:  ");
		int AwbreyNJ = Userinput.nextInt();
		System.out.print("What are Awbrey's results in Conneticut:  ");
		int AwbreyCON = Userinput.nextInt();
		System.out.print("What are Martinez's results in New York:  ");
		int MartinezNY = Userinput.nextInt();
		System.out.print("What are Martinez's results in New Jersey:  ");
		int MartinezNJ = Userinput.nextInt();
		System.out.print("What are Martinez's results in Conneticut:  ");
		int MartinezCON = Userinput.nextInt();
		
		System.out.println(" ");

		System.out.println("Election Results for New York:");
		System.out.println("Awbrey:   " + AwbreyNY);
		System.out.println("Martinez: " + MartinezNY);
		System.out.println(" ");
		
		System.out.println("Election Results for New Jersey:");
		System.out.println("Awbrey:   " + AwbreyNJ);
		System.out.println("Martinez: " + MartinezNJ);
		System.out.println(" ");

		System.out.println("Election Results for Conneticut:");
		System.out.println("Awbrey:   " + AwbreyCON);
		System.out.println("Martinez: " + MartinezCON);
		System.out.println(" ");
		 
		int AwbreyTotal = AwbreyNY + AwbreyNJ + AwbreyCON;
		int MartinezTotal = MartinezNY + MartinezNJ + MartinezCON;
		int ElectionTotal = AwbreyTotal + MartinezTotal;
		 
		double AwbreyPercentage =(double) AwbreyTotal / ElectionTotal * 100;
		double MartinezPercentage =(double) MartinezTotal / ElectionTotal * 100;

		
		System.out.println("Candidate    Votes    Percentage");
		System.out.println(" ");
		System.out.println("Awbrey       "+ AwbreyTotal + "      " + nf.format(AwbreyPercentage/0.1));
		System.out.println("Martinez     "+ MartinezTotal + "      " + nf.format(MartinezPercentage/0.1));
		System.out.print("TOTAL VOTES: " + (MartinezTotal + AwbreyTotal));

		
}
}}
