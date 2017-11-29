package com.qhit.wyk;
/** 
 * @author  作者 E-mail:1456014420@qq.com
 * @date    创建时间：2017年11月24日 下午1:23:39 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Square implements IForm{

	//.创建正方形，实现形状这个接口。要求正方形具有的属性包括：边长、周长、面积（属性私有） ，
	//并创建两种构造方法（1 无参构造方法 2 参数为边长的构造方法）
	
	
	private double length;
	private double perimeter;
	private double area;
	
	
	@Override
	public String toString() {
		return "Square [length=" + length + "]";
	}


	public Square(double length) {
		this.length = length;
		
	}


	public Square() {
		// TODO Auto-generated constructor stub
	}


	public double getLength() {
		return length;
	}


	public void setLength(double length) {
		this.length = length;
	}


	public double getPerimeter() {
		return perimeter;
	}


	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}


	public double getArea() {
		return area;
	}


	public void setArea(double area) {
		this.area = area;
	}
	
	
	
	
	
	
	
	

	
	
	
	


	
	
	
	
}
