package SkillBuilders;

import java.util.Scanner; // Import scanner

public class GradeAvg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		

Scanner Userinput = new Scanner (System.in);


System.out.println("Please enter five grades.");
System.out.println("Enter your first grade: ");
int grade1 = Userinput.nextInt();
System.out.println("Enter your second grade: ");
int grade2 = Userinput.nextInt();
System.out.println("Enter your third grade: ");
int grade3 = Userinput.nextInt();
System.out.println("Enter your fourth grade: ");
int grade4 = Userinput.nextInt();
System.out.println("Enter your fifth grade: ");
int grade5 = Userinput.nextInt();
int total = (grade1 + grade2 + grade3 + grade4 + grade5);
double gradeavg = (double) total / 5;
 System.out.print("Your average grade is " + gradeavg);





	
	
	
	
	}

}
