package edu.wbqa.oops;

public class Circle extends Shape implements ShapeConstants{
	
	private double radius;
	private int noOfSides;
	
	public Circle(int noOfSides){
		this.noOfSides=noOfSides;
	}
	public double getradius()
	{
		return radius;
	}
	public void setRadius(double r){
		r=radius;
	}

	@Override
	public double calculateArea() {
		double area;
		area=pi* radius * radius;
		return area;
	}

	@Override
	public double calculatePerimeter() {
		double p;
		p=2*pi*radius;
		return p;
	}
	@Override
	public int setSides() {
		// TODO Auto-generated method stub
		return noOfSides;
	}

	
	

}
