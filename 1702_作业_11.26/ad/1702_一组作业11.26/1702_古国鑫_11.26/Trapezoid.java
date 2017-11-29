package com.qhit.guguoxin;
/** 
 * @author  作者:古国鑫&王焱
 * @date    创建时间：2017年11月26日 下午8:21:31 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Trapezoid {

	double above;
	double below;
	double high;
	double left;
	double right;
	double perimeter;
	private double area;
	
	
	public Trapezoid() {
		super();
	}
	

	public Trapezoid(double above, double below) {
		
		super();
		
		this.above = above;
		
		this.below = below;
		
	}


	public double perimeter() {
		return above+below+left+right;
	}

	public double area() {
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
