package com.qhit;

public class Trapezoid implements Form{
	
	/*c.创建梯形，实现形状这个接口。要求梯形具有的属性包括：
    上边上、下边长、高、周长、面积（属性私有） ，并创建两种构造方法
    （1 无参构造方法 2 参数为上边长、下边长的构造方法）
    */

	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		
	}  
	
	private double upside;//上边长
	private double under;//下边长
	private double high;//高
	private double perimeter;//周长
	private double area;//面积
	
	public Trapezoid() {
		
	}

	
	public Trapezoid(double upside, double under) {
		
		this.upside = upside;
		this.under = under;
	}

	public double getUpside() {
		return upside;
	}
	public void setUpside(double upside) {
		this.upside = upside;
	}

	public double getUnder() {
		return under;
	}
	public void setUnder(double under) {
		this.under = under;
	}

	public double getHigh() {
		return high;
	}
	public void setHigh(double high) {
		this.high = high;
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
