package com.qhit.guguoxin;
/** 
 * @author  ����:�Ź���&����
 * @date    ����ʱ�䣺2017��11��26�� ����8:20:10 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Square {


	double perimeter;
	double side;
	private double area;

	public Square() {

	}

	public Square(double side) {

		this.side = side;
	}

	public double perimeter() {
		// TODO Auto-generated method stub
		return 4*side;
	}

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
