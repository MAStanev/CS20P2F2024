package SkillBuilders;

import java.util.Scanner; // Import scanner

public class GradeAvg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		

Scanner Userinput = new Scanner (System.in);
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

int total = 0;
total += grade1;
total += grade2;
total += grade3;
total += grade4;
total += grade5;

double average = (double) total / 5;

System.out.print("Your grade average is " + average + "%");


}
}
