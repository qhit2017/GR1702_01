package com.kyh;

public class Trapezoid implements Form{
	double above;//上边长
	double below;//下边长
	double high;//高
	double left;//左边
	double right;//右边
	double perimeter;//周长
	private double area;//面积
	
	
	public Trapezoid() {
		super();
	}
	

	public Trapezoid(double above, double below) {
		super();
		this.above = above;
		this.below = below;
	}


	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return above+below+left+right;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return ((above+below)*high)/2;
	}


	/**
	 * @return the area
	 */
	public double getArea() {
		return area;
	}


	/**
	 * @param area the area to set
	 */
	public void setArea(double area) {
		this.area = area;
	}

	
}
