package SkillBuilders;

import java.util.*;

public class Rectangle3of5 {

	private double width, length;

	public Rectangle3of5() {

		width = 1;

		length = 1;

	}

	public Rectangle3of5(double w, double l) {

		width = w;

		length = l;

	}

	public void setWidth(double w) {

		width = w;

	}

	public void setLength(double l) {

		length = l;

	}

	public double getWidth() {

		return width;

	}

	public double getLength() {

		return length;

	}

	public boolean euquals(Object r) {

		Rectangle3of5 testObj = (Rectangle3of5) r;

		if (testObj.getLength()==length && testObj.getWidth()==width) {

			return(true);

		}

		else {

			return(false);

		}	

	}

	public String toString() {

		String myString;

		myString = "The rectangle has the length "+length+" and width "+width;

		return myString;

	}

	

	public static void main(String[] args) {

		Scanner userinput = new Scanner (System.in);

		Rectangle3of5 rectangle1 = new Rectangle3of5();

		Rectangle3of5 rectangle2 = new Rectangle3of5();

		System.out.print("Enter the width of the first rectangle: ");

		rectangle1.setWidth(userinput.nextDouble());

		System.out.print("Enter the length of the first rectangle: ");

		rectangle1.setLength(userinput.nextDouble());

		

		System.out.print("Enter the width of the second rectangle: ");

		rectangle2.setWidth(userinput.nextDouble());

		System.out.print("Enter the length of the second rectangle: ");

		rectangle2.setLength(userinput.nextDouble());

		

		if (rectangle1.equals(rectangle2)) {

			System.out.println("The two rectangles have the same length and width");

		}

		else {

			System.out.println("The two rectangles have different lengths and widths");

		}

		

		System.out.println(rectangle1);

		System.out.println(rectangle2);

	}



}