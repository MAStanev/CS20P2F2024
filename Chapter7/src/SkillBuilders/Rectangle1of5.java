package SkillBuilders;

public class Rectangle1of5 {

	private double length, width;

	
	public Rectangle1of5() // Constructor method
		{
			length = 1; // default length
			width = 1; // default width
		}
	
	public Rectangle1of5(double l, double w) // Constructor method	2
		{
			length = 1;
			width = 1;
		}
	
	public void setLength(double newLength) 
		{
			length = newLength;
		}
	
	public void setWidth(double newWidth)
		{ 
			width = newWidth;
		}

	public double getLength()
		{
			return(length);
		}
	public double getWidth()
		{
			return(width);
		}

	public static void main(String[] args) 
	{
		Rectangle box = new Rctangle(3, 5);
	}
}