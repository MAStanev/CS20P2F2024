package SkillBuilders;

import java.util.*;

public class Circle4of4 {

	private double Radius;

	private double PI=3.14;

	public Circle4of4() {

		Radius = 1;

	}

	public Circle4of4(double r) {

		Radius = r;

	}

	public void setRadius(double r) {

		Radius = r;

	}

	public double getRadius() {

		return Radius;

	}

	public boolean equals(Object c) {

		Circle4of4 testOjb = (Circle4of4) c;

		if (testOjb.getRadius()==Radius) {

			return(true);

		}

		else {

			return(false);

		}

	}

	public String toString() {

		String circleString;

		circleString = ("has a radius of "+Radius);

		return circleString;

	}

	public static void main(String[]args) {

		Scanner userinput = new Scanner (System.in);

		Circle4of4 spot1 = new Circle4of4();

		Circle4of4 spot2 = new Circle4of4();

		System.out.print("Enter the radius of the first circle: ");

		spot1.setRadius(userinput.nextDouble());

		System.out.print("Enter the radius of the second circle: ");

		spot2.setRadius(userinput.nextDouble());

		

		if (spot1.equals(spot2)) {

			System.out.println("The two circles have the same radius");

		}

		else {

			System.out.println("The two circle have different radius");

		}

		System.out.println("Circle 1 "+spot1);

		System.out.println("Circle 2 "+spot2);

	}

}