package com.ai;

public class Trapezoid implements Form{
	int up;//上边长
	int below;//下边长
	int high;//高
	int tGirth;//周长
	int waist;//腰
	private int tAreas;//面积
	
	//构造方法
	public Trapezoid(){
		System.out.println();
	}
	
	public Trapezoid(int up, int below) {
		this.up = up;
		this.below = below;
	}
	public double gettAreas() {
		return tAreas;
	}
	//重写接口里的抽象方法
	@Override
	public double perimeter() {
		tGirth = up+below+(waist*2);
		return tGirth;
	}

	@Override
	public double area() {
		tAreas = ((up+below)*high)/2;
		return  gettAreas();
	}

}
