package SkillBuilders;

import java.util.*;

public class Circle2of4 {

	private double radius;

	private double PI = 3.14; // Initialize PI as 3.14

	public Circle2of4() 
	{
		radius = 1;	// Default radius
	}

	public Circle2of4(double r) 
	{
		radius = r;
	}

	public void setRadius(double r) 
	{
		radius = r;
	}

	public double getRadius() 
	{
		return radius;
	}

	public double Circumference() 
	{
		double circumference = radius*2*PI; // Calculation for circumference

		return circumference;
	}

	
	public static void main(String[] args) 
	{
		Scanner userinput = new Scanner(System.in);

		System.out.print("Enter the radius: "); // Prompt user to enter radius and store it as radius

		Circle2of4 spot = new Circle2of4(); // Turn the Circle2of4 class into a variable named spot

		spot.setRadius(userinput.nextDouble()); // Save the radius to setRadius within spot

		
		System.out.println("The radius is "+spot.getRadius()); // Print radius

		System.out.println("The circumference is "+spot.Circumference()); // Print circumference
	}



}