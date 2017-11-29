package com.kyh;

public class Trapezoid implements Form{
	double above;//�ϱ߳�
	double below;//�±߳�
	double high;//��
	double left;//���
	double right;//�ұ�
	double perimeter;//�ܳ�
	private double area;//���
	
	
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
