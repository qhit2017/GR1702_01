package com.kyh;

public class Square implements Form {

	double perimeter;//�ܳ�
	double side;//�߳�
	private double area;//���

	public Square() {

	}

	public Square(double side) {

		this.side = side;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 4*side;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return side*side;
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
