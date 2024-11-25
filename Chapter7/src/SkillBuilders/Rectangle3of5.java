package SkillBuilders;

import java.util.*;

public class Rectangle3of5 {

	private double width, length; // Declare instance variables

	public Rectangle3of5() // Default length & width
	{ 
		width = 1;

		length = 1;

	}

	public Rectangle3of5(double w, double l) 
	{
		width = w;

		length = l;
	}

	public void setWidth(double w) 
	{
		width = w; // Assign "w" to width of rectangle 
	}

	public void setLength(double l) 
	{
		length = l; // Assign "l" to length of rectangle
	}

	public double getWidth() 
	{
		return width;

	}

	public double getLength() {

		return length;
	}

	public boolean equals(Object r) // Method to check if two rectangles are equal

	{
		Rectangle3of5 testObj = (Rectangle3of5)r;

		// Checks if length and width of rectangles are equal
		if(testObj.getLength() == length && testObj.getWidth() == width)

		{
			return true; // Return true if dimensions are equal
		}

		else

		{
			return false; // Return false if dimensions do not match
		}

	}

	public String toString() {

		String myString;

		myString = "The rectangles length is "+ length + " and the width is "+ width; 

		return myString;

	}

	

	public static void main(String[] args) {

		Scanner userinput = new Scanner (System.in);

		// Create two Rectangle3of5, one for rectangle1 and one for rectangle2
		Rectangle3of5 rectangle1 = new Rectangle3of5();

		Rectangle3of5 rectangle2 = new Rectangle3of5();

		System.out.print("Enter the width of the first rectangle: ");

		rectangle1.setWidth(userinput.nextDouble()); // Stores the width of the first rectangle to rectangle1

		System.out.print("Enter the length of the first rectangle: ");

		rectangle1.setLength(userinput.nextDouble()); // Stores the length of the first rectangle to rectangle1

		

		System.out.print("Enter the width of the second rectangle: ");

		rectangle2.setWidth(userinput.nextDouble()); // Stores the width of the second rectangle to rectangle2

		System.out.print("Enter the length of the second rectangle: ");

		rectangle2.setLength(userinput.nextDouble()); // Stores the length of the second rectangle to rectangle2

		

		if (rectangle1.equals(rectangle2)) {

			System.out.println("The two rectangles have the same length and width");

		}

		else {

			System.out.println("The two rectangles have different lengths and widths");

		}

		

		System.out.println(rectangle1); // Prints length & width for rectangle 1

		System.out.println(rectangle2); // Prints length & width for rectangle 2

	}



}