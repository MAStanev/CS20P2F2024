package SkillBuilders;

import java.util.*;

public class Rectangle1of5 {

	private double width, length;

	public Rectangle1of5() // Default constructor
	{
		width = 1;

		length = 1;
	}

	public Rectangle1of5(double w, double l) 
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

	public double Area() 
	{
		double a = length*width; // Calculations for area

		return a;
	}

	public double Perimeter() 
	{
		double p = 2*length+2*width; // Calculation for perimeter

		return p;
	}

	public static void main(String[] args)
	{
		Scanner userinput = new Scanner (System.in);

		Rectangle1of5 Rectangle = new Rectangle1of5();

		System.out.print("Enter the length of the rectangle: ");

		Rectangle.setLength(userinput.nextDouble());

		System.out.print("Enter the width of the rectangle: ");

		Rectangle.setWidth(userinput.nextDouble());


		// Print area and perimeter
		System.out.println("The area of the rectangle is: "+ Rectangle.Area());

		System.out.println("The perimeter of the rectangle is: "+ Rectangle.Perimeter());

	}



}