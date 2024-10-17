package SkillBuilders;

import java.util.Scanner;

public class NumbersSum {

		public static void main(String[] args) {

		Scanner userinput = new Scanner (System.in);

			

int Digit = 0;

			
System.out.print("Enter a number: ");

int Number = userinput.nextInt();

			

for (int i = 1; i<=Number; i+=1) {

System.out.println(i);

Digit += i;}

		
System.out.println("Sum of the numbers are "+ Digit);

}
}