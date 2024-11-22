package SkillBuilders;

import java.util.*;
import java.lang.Math;


public class Circle3of4 {

	private double radius;

	private double PI = 3.14; // Initialize PI as 3.14

	public Circle3of4() 
	{
		radius = 1;	// Default radius
	}

	public Circle3of4(double r) 
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
	
	public static void displayAreaFormula(Circle3of4 spot)
	{
		System.out.println("Circle area Formula = PI x (radius ^ 2)");
		
		double circleArea = 3.14 * Math.pow(spot.getRadius(), 2);
		System.out.println("The area of the circle is " + circleArea);
	}

	
	public static void main(String[] args) 
	{
		Scanner userinput = new Scanner(System.in);

		System.out.print("Enter the radius: "); // Prompt user to enter radius and store it as radius

		Circle3of4 spot = new Circle3of4(); // Turn the Circle2of4 class into a variable named spot

		spot.setRadius(userinput.nextDouble()); // Save the radius to setRadius within spot

		
		System.out.println("The radius is "+spot.getRadius()); // Print radius

		System.out.println("The circumference is "+spot.Circumference()); // Print circumference

		Circle3of4.displayAreaFormula(spot);
		
	}



}