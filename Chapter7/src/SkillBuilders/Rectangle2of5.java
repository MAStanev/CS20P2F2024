package SkillBuilders;

import java.util.*;

public class Rectangle2of5 {

	private double width, length;

	public Rectangle2of5() // Default constructor
	{
		width = 1;

		length = 1;
	}

	public Rectangle2of5(double w, double l) 
	{
		width = w;

		length = l;
	}

	public void setWidth(double w) 
	{
		width = w;
	}

	public void setLength(double l) 
	{
		length = l;
	}

	public double getWidth()
	{
		return width;
	}

	public double getLength() 
	{
		return length;
	}


	public static void displayAreaFormula(Rectangle2of5 Rectangle)
	{
		
		System.out.println("Formula of for area of a rectangle = Length x Width");

		double rectangleArea = Rectangle.length * Rectangle.width;
		System.out.print("The area of the rectangle is " + rectangleArea);

	}


	public static void main(String[] args)
	{
		Scanner userinput = new Scanner (System.in);

		Rectangle2of5 Rectangle = new Rectangle2of5();

		System.out.print("Enter the length of the rectangle: "); // Prompt user for length

		Rectangle.setLength(userinput.nextDouble()); // Store length 

		System.out.print("Enter the width of the rectangle: "); // Prompt user for width

		Rectangle.setWidth(userinput.nextDouble()); // Store width

		displayAreaFormula(Rectangle); // Calls on displayAreaFormula method

	close();
	}

	private static void close() {
		// TODO Auto-generated method stub
		
	}



}