package SkillBuilders;

import java.util.Scanner;

public class RectanglePerimeter {

	public static void main(String[] args) {
		
Scanner userInput = new Scanner(System.in);

		//Declaration and Initialization
		System.out.print("Please enter a length: ");
		int length = userInput.nextInt();
		System.out.print("Please enter a width: ");
		int width =userInput.nextInt();
		
		int area = length * width;
		System.out.print("The area of the rectangle is " + area);
		
	}

}
