package com.qhit;

public class Square implements Form {
	
	//b.创建正方形，实现形状这个接口。要求正方形具有的属性包括：边长、周长、面积（属性私有） ，
    //并创建两种构造方法（1 无参构造方法 2 参数为边长的构造方法）

	
	private double  side;//边长
	private double  perimeter;//周长
	private double  area;//面积
	
	
	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	public Square() {
		
	}

	
	public Square(double side) {
		
		this.side = side;
	}
	
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
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
