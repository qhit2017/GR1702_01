package com.ai;

public class Square implements Form{

	double length;//边长
	double girth;//周长
	private double areas;//面积
	//----------------------------------
	//构造方法
	
	public Square(){
		System.out.println();
	}
	public Square(double length) {
	this.length = length;
	}
	public double getAreas() {
		return areas;
	}
	//重写接口里的抽象方法
	
	@Override
	public double perimeter() {
		girth=length*4;
		return girth;
	}
	@Override
	public double area() {
		areas=length*length;
		return getAreas();
	}

}
