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
		
		int perimeter = (length + width) * 2;
		System.out.print("The perimeter of the rectangle is " + perimeter);
		
	}

}
