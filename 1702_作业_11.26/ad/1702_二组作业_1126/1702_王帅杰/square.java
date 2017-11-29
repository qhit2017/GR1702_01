package com.qhit;
	
public class square implements form {
	double length;
	double girth;
	private double areas;
	
	
	//构造方法
	public square(){
		System.out.println();
	}


	public double getLength() {
		return length;
	}

	public double getAreas() {
		return areas;
	}
	//重写接口里的抽象方法


	@Override
	public double perimeter() {
		girth = length*4;
		return girth;
	}


	@Override
	public double area() {
		areas =length*length;
		return getAreas();
	}
	
	
	
}
