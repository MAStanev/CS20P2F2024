package SkillBuilders;

import java.util.*;

public class Circle1of4 {

	private double radius;

	private static double PI = 3.14; // Initialize PI as 3.14

	public Circle1of4() 

	{
		radius = 1; //default radius
	}

	public Circle1of4(double r)

	{
		radius = r;
	}

	public void setRadius(double r) // Create setRadius method
	{
		radius = r;
	}

	public double getRadius() // Create getRadius method

	{
		return radius;
	}

	public double Circumference() // Create Circumference method

	{
		double Circumference = 2 * PI * radius; // Calculate circumference

		return Circumference;
	}

 

	public static void main(String[] arg) // Create default method
	
	{
		Circle1of4 spot = new Circle1of4();

		

		spot.setRadius(3);

		System.out.println("The radius is "+spot.getRadius()); // Print radius

		System.out.println("The circumference is "+spot.Circumference()); // Print circumference
	}
}